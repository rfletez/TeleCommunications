package com.commute.customerMS.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commute.customerMS.dto.CustomerDTO;
import com.commute.customerMS.dto.LoginDTO;
import com.commute.customerMS.entity.Customer;
import com.commute.customerMS.repository.CustomerRepository;

@Service
public class CustomerService {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CustomerRepository customerRepo;
	
	public void createCustomer(CustomerDTO custDTO) {
		logger.info("Creation request for customer {}", custDTO);
		
		Customer cust = custDTO.createEntity();
		customerRepo.save(cust);
	}
	
	//Login
	public boolean login(LoginDTO loginDTO) {
		logger.info("Login request for customer {} with password {}", loginDTO.getPhoneNo(), loginDTO.getPassword());
		
		Customer cust = customerRepo.findById(loginDTO.getPhoneNo()).get();
		
		if(cust != null && cust.getPassword().equals(loginDTO.getPassword())) {
			return true;
		}
		
		return false;
	}
	
	//Fetches full profile of a specific customer
	public CustomerDTO getCustomerProfile(Long phoneNo) {
		logger.info("Profile request for customer {}", phoneNo);
		
		Customer cust = customerRepo.findById(phoneNo).get();
		CustomerDTO custDTO = CustomerDTO.valueOf(cust);
		
		logger.info("Profile for customer : {}", custDTO);
		
		return custDTO;
	}

}