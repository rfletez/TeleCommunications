package com.commute.customerMS.dto;

public class PlanDTO {
	
	private Integer planId;
	private String planName;
	private Integer nationalRate;
	private Integer localRate;
	
	public PlanDTO() {
		super();
	}

	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Integer getNationalRate() {
		return nationalRate;
	}
	public void setNationalRate(Integer nationalRate) {
		this.nationalRate = nationalRate;
	}

	public Integer getLocalRate() {
		return localRate;
	}
	public void setLocalRate(Integer localRate) {
		this.localRate = localRate;
	}

	@Override
	public String toString() {
		return "PlanDTO [planId=" + planId + ", planName=" + planName + ", nationalRate=" + nationalRate
				+ ", localRate=" + localRate + "]";
	}
	
}