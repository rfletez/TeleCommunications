package com.commute.plan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commute.plan.entity.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer> {

}