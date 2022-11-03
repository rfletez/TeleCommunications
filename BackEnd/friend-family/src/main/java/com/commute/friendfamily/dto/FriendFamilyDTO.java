package com.commute.friendfamily.dto;

import com.commute.friendfamily.entity.FriendFamily;

public class FriendFamilyDTO {
	
	private long phoneNo;
	
	private long friendAndFamily;

	
	public FriendFamilyDTO() {
		super();
	}

	public FriendFamilyDTO(long phoneNo, long friendAndFamily) {
		this();
		this.phoneNo = phoneNo;
		this.friendAndFamily = friendAndFamily;
	}
	

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public long getFriendAndFamily() {
		return friendAndFamily;
	}

	public void setFriendAndFamily(long friendAndFamily) {
		this.friendAndFamily = friendAndFamily;
	}
	
	//Converts DTO to Entity
	public FriendFamily createFriend() {
		FriendFamily friend = new FriendFamily();
		
		friend.setPhoneNo(this.getPhoneNo());
		friend.setFriendAndFamily(this.getFriendAndFamily());
		
		return friend;
	}

	@Override
	public String toString() {
		return "FriendFamilyDTO [phoneNo=" + phoneNo + ", friendAndFamily=" + friendAndFamily + "]";
	}

}