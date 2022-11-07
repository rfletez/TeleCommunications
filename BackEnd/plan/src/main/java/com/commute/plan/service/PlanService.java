package com.commute.plan.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commute.plan.dto.PlanDTO;
import com.commute.plan.entity.Plan;
import com.commute.plan.repository.PlanRepository;

@Service
public class PlanService {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PlanRepository planRepo;
	
	//Fetches all Plan details
	public List<PlanDTO> getAllPlans() {
		List<Plan> plans = planRepo.findAll();
		List<PlanDTO> planDTOs = new ArrayList<PlanDTO>();
		
		for(Plan plan : plans) {
			PlanDTO planDTO = PlanDTO.valueOf(plan);
			planDTOs.add(planDTO);
		}
		
		logger.info("Plan Details: {}", planDTOs);
		
		return planDTOs;
	}

}
