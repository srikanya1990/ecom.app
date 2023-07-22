package com.ssd.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.ecom.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
