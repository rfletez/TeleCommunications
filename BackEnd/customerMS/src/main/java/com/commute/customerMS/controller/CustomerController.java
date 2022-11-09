package com.commute.customerMS.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.commute.customerMS.dto.CustomerDTO;
import com.commute.customerMS.dto.LoginDTO;
import com.commute.customerMS.dto.PlanDTO;
import com.commute.customerMS.service.CustomerService;


@RestController
@CrossOrigin(origins = "http://localhost:4100")
@RequestMapping("/api/v1")
public class CustomerController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CustomerService custService;
	
	@Value("${friend.uri}")
	private String friendUri;
	
	@Value("${path.uri}")
	private String pathUri;
	
	
	//Create a new customer
	@PostMapping("/customers")
	public void createCustomer(@RequestBody CustomerDTO custDTO) {
		logger.info("Creation request for customer {}", custDTO);
		
		custService.createCustomer(custDTO);
	}
	
	//Login
	@PostMapping("/login")
	public boolean login(@RequestBody LoginDTO loginDTO) {
		logger.info("Login request for customer {} with password {}", loginDTO.getPhoneNo(), loginDTO.getPassword());
		
		return custService.login(loginDTO);
	}
	
	//Fetches full profile of a specific customer
	@GetMapping("/customers/{phoneNo}")
	public CustomerDTO getCustomerProfile(@PathVariable("phoneNo") Long phoneNo) {
		logger.info("Profile request for customer {}", phoneNo);
		
		CustomerDTO custDTO = custService.getCustomerProfile(phoneNo);
		PlanDTO planDTO = new RestTemplate().getForObject(pathUri+custDTO.getCurrentPlan().getPlanId(), PlanDTO.class);
		custDTO.setCurrentPlan(planDTO);
		
		@SuppressWarnings("unchecked")
		List<Long> friends = new RestTemplate().getForObject(friendUri+phoneNo+"/friends", List.class);
		custDTO.setFriendAndFamily(friends);
		
		return custDTO;
	}

}