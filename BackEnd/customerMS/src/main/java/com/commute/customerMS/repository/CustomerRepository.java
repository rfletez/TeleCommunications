package com.commute.customerMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commute.customerMS.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}