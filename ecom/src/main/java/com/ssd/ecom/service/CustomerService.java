package com.ssd.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssd.ecom.model.Customer;
import com.ssd.ecom.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public List<Customer> getAllCustomers(){
		
		return customerRepository.findAll();
	}
     
     public Optional<Customer> getauthorbyid(Long id){
		
		return customerRepository.findById(id);
	}
}
