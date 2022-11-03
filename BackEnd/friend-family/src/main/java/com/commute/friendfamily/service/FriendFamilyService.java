package com.commute.friendfamily.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.commute.friendfamily.dto.FriendFamilyDTO;
import com.commute.friendfamily.entity.FriendFamily;
import com.commute.friendfamily.repository.FriendFamilyRepository;

public class FriendFamilyService {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private FriendFamilyRepository friendRepo;
	
	//Create FriendFamily
	public void saveFriend(Long phoneNo, FriendFamilyDTO friendDTO) {
		logger.info("Creation request for customer {} with data {}", phoneNo, friendDTO);
		
		friendDTO.setPhoneNo(phoneNo);
		FriendFamily friend = friendDTO.createFriend();
		
		friendRepo.save(friend);
	}
	
	//Get friend and family phone number list of a given customer
	public List<Long> getSpecificFriends(Long phoneNo) {
		logger.info("Friend and family details for customer {}", phoneNo);
		
		List<Long> friendList = new ArrayList<Long>();
		List<FriendFamily> friends = friendRepo.getByPhoneNo(phoneNo);
		
		for(FriendFamily friendFamily : friends) {
			friendList.add(friendFamily.getFriendAndFamily());
		}
		
		logger.info("The friend list is for customer {} has this list: {}", phoneNo, friendList);
		
		return friendList;
	}

}