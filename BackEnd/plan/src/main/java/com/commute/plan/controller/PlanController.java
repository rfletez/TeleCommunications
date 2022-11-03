package com.commute.plan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4100")
@RequestMapping("/api/v1/")
public class PlanController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

}
