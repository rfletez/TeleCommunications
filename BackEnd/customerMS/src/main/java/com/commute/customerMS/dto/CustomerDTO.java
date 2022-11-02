package com.commute.customerMS.dto;

import java.util.List;

import com.commute.customerMS.entity.Customer;

public class CustomerDTO {
	
	private Long phoneNo;
	private String name;
	private int age;
	private char gender;
	private List<Long> friendAndFamily;
	private String password;
	private String address;
	private PlanDTO currentPlan;
	
	
	
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public List<Long> getFriendAndFamily() {
		return friendAndFamily;
	}
	public void setFriendAndFamily(List<Long> friendAndFamily) {
		this.friendAndFamily = friendAndFamily;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public PlanDTO getCurrentPlan() {
		return currentPlan;
	}
	public void setCurrentPlan(PlanDTO currentPlan) {
		this.currentPlan = currentPlan;
	}
	
	@Override
	public String toString() {
		return "CustomerDTO [phoneNo=" + phoneNo + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", friendAndFamily=" + friendAndFamily + ", password=" + password + ", address=" + address
				+ ", currentPlan=" + currentPlan + "]";
	}
	
	//Converts Entity to DTO
	public static CustomerDTO valueOf(Customer cust) {
		CustomerDTO custDTO = new CustomerDTO();
		
		custDTO.setAddress(cust.getAddress());
		custDTO.setAge(cust.getAge());
		custDTO.setName(cust.getName());
		custDTO.setPhoneNo(cust.getPhoneNo());
		custDTO.setGender(cust.getGender());
		
		PlanDTO planDTO = new PlanDTO();
		planDTO.setPlanId(cust.getPlanId());
		
		custDTO.setCurrentPlan(planDTO);
		
		return custDTO;
	}
	
	//Converts DTO to Entity
	public Customer createEntity() {
		Customer cust = new Customer();
		
		cust.setAddress(this.getAddress());
		cust.setAge(this.getAge());
		cust.setGender(this.getGender());
		cust.setName(this.getName());
		cust.setPhoneNo(this.getPhoneNo());
		cust.setPassword(this.getPassword());
		cust.setPlanId(this.getCurrentPlan().getPlanId());
		
		return cust;
	}
	
}