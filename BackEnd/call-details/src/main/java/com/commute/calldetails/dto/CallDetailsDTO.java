package com.commute.calldetails.dto;

import java.util.Date;

import com.commute.calldetails.entity.CallDetails;

public class CallDetailsDTO {
	
	private long calledBy;
	private long calledTo;
	private Date calledOn;
	private int duration;
	

	public CallDetailsDTO() {
		super();
	}

	public CallDetailsDTO(long calledBy, long calledTo, Date calledOn, int duration) {
		this();
		this.calledBy = calledBy;
		this.calledTo = calledTo;
		this.calledOn = calledOn;
		this.duration = duration;
	}


	public long getCalledBy() {
		return calledBy;
	}
	public void setCalledBy(long calledBy) {
		this.calledBy = calledBy;
	}

	public long getCalledTo() {
		return calledTo;
	}
	public void setCalledTo(long calledTo) {
		this.calledTo = calledTo;
	}

	public Date getCalledOn() {
		return calledOn;
	}
	public void setCalledOn(Date calledOn) {
		this.calledOn = calledOn;
	}

	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	//Converts Entity to DTO
	public static CallDetailsDTO valueOf(CallDetails callDetails) {
		CallDetailsDTO callsDTO = new CallDetailsDTO();
		
		callsDTO.setCalledBy(callDetails.getCalledBy());
		callsDTO.setCalledOn(callDetails.getCalledOn());
		callsDTO.setCalledTo(callDetails.getCalledTo());
		callsDTO.setDuration(callDetails.getDuration());
		
		return callsDTO;
	}

	@Override
	public String toString() {
		return "CallDetailsDTO [calledBy=" + calledBy + ", calledTo=" + calledTo + ", "
				+ "calledOn=" + calledOn
				+ ", duration=" + duration + "]";
	}
	
}