package com.commute.customerMS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@Column(name = "phone_no", nullable = false)
	private Long phoneNo;
	
	@Column(nullable = false, length = 50)
	private String name;
	
	@Column(nullable = false)
	private Integer age;
	
	@Column(nullable = false, length = 50)
	private String address;
	
	@Column(nullable = false, length = 50)
	private String password;
	
	@Column(nullable = false, length = 1)
	private char gender;
	
	@Column(name = "plan_id", nullable = false)
	private Integer planId;
	
	
	public Customer() {
		super();
	}
	
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
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	
}