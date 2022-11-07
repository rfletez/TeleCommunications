package com.commute.plan.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commute.plan.dto.PlanDTO;
import com.commute.plan.service.PlanService;

@RestController
@CrossOrigin(origins = "http://localhost:4100")
@RequestMapping("/api/v1/")
public class PlanController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PlanService planService;
	
	//Fetches all plan details
	@GetMapping(value="/plans")
	public List<PlanDTO> getAllPlans() {
		logger.info("Fetching all plans.");
		
		return planService.getAllPlans();
	}
	
	@GetMapping(value="/plans/{planId}")
	public PlanDTO getSpecificPlan(@PathVariable("planId") Integer planId) {
		logger.info("Fetching details of plan {}", planId);
		
		return planService.getSpecificPlan(planId);
	}
}