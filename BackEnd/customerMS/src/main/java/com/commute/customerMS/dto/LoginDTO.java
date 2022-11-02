package com.commute.customerMS.dto;

public class LoginDTO {
	
	private long phoneNo;
	private String password;
	
	public LoginDTO() {
		super();
	}

	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDTO [phoneNo=" + phoneNo + ", password=" + password + "]";
	}

}