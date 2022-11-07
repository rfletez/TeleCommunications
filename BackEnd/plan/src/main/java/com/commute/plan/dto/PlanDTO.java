package com.commute.plan.dto;

import com.commute.plan.entity.Plan;

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

	//Converts Entity to DTO
	public static PlanDTO valueOf(Plan plan) {
		PlanDTO planDTO = new PlanDTO();
		
		planDTO.setLocalRate(plan.getLocalRate());
		planDTO.setNationalRate(plan.getNationalRate());
		planDTO.setPlanId(plan.getPlanId());
		planDTO.setPlanName(plan.getPlanName());
		
		return planDTO;
	}

	@Override
	public String toString() {
		return "PlanDTO [planId=" + planId + ", planName=" + planName + ", nationalRate=" + nationalRate
				+ ", localRate=" + localRate + "]";
	}
	
}