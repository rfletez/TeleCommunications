package com.commute.calldetails.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commute.calldetails.dto.CallDetailsDTO;
import com.commute.calldetails.entity.CallDetails;
import com.commute.calldetails.repository.CallDetailsRepository;

@Service
public class CallDetailsService {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CallDetailsRepository callRepo;
	
	//Fetches call details of a specific customer
	public List<CallDetailsDTO> getCustomerCallDetails(long phoneNo) {
		logger.info("Call details request for customer {}", phoneNo);
		
		List<CallDetails> callDetails = callRepo.findByCalledBy(phoneNo);
		List<CallDetailsDTO> callsDTO = new ArrayList<CallDetailsDTO>();
		
		for(CallDetails call : callDetails) {
			callsDTO.add(CallDetailsDTO.valueOf(call));
		}
		
		logger.info("Call details for customer {}", callDetails);
		
		return callsDTO;
	}

}
