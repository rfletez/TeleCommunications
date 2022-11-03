package com.commute.calldetails.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commute.calldetails.dto.CallDetailsDTO;
import com.commute.calldetails.service.CallDetailsService;

@RestController
@CrossOrigin(origins = "http://localhost:4100")
@RequestMapping("/api/v1/")
public class CallDetailsController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CallDetailsService callService;
	
	//Fetches call details of a specific customer
	@GetMapping("/customers/{phoneNo}/calldetails")
	public List<CallDetailsDTO> getCustomerCallDetails(@PathVariable("phoneNo") long phoneNo) {
		logger.info("Call details for customer {}", phoneNo);
		
		return callService.getCustomerCallDetails(phoneNo);
	}

}
