package com.commute.friendfamily.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commute.friendfamily.dto.FriendFamilyDTO;
import com.commute.friendfamily.service.FriendFamilyService;

@RestController
@CrossOrigin(origins = "http://localhost:4100")
@RequestMapping("/api/v1")
public class FriendFamilyController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private FriendFamilyService friendService;
	
	//Create FriendFamily
	@PostMapping("/customers/{phoneNo}/friends")
	public void saveFriend(@PathVariable() Long phoneNo, @RequestBody FriendFamilyDTO friendDTO) {
		logger.info("Creation request for customer {} with this data {}", phoneNo, friendDTO);
		
		friendService.saveFriend(phoneNo, friendDTO);
	}
	
	//Fetches friend and family numbers of a given customer phoneNo
	@GetMapping("/customers/{phoneNo}/friends")
	public List<Long> getSpecificFriends(@PathVariable() Long phoneNo) {
		logger.info("Friend and Family numbers for customer {}", phoneNo);
		
		return friendService.getSpecificFriends(phoneNo);
	}

}