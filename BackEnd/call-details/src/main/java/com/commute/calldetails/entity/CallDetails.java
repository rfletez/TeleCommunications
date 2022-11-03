package com.commute.calldetails.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calldetails")
public class CallDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private long calledBy;
	
	@Column(nullable = false)
	private long calledTo;
	
	@Column(nullable = false)
	private Date calledOn;
	
	@Column(nullable = false)
	private int duration;
	
	
	public CallDetails() {
		super();
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
}