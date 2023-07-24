package com.ssd.ecom.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssd.ecom.model.Customer;
import com.ssd.ecom.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
	
	@Autowired
	private CustomerService  customerService;
	
	@GetMapping("/wlcome")
	public String getWelcomeMsg() {
		return "Welocme SSD Ecom App";
	}
	@GetMapping("/username")
	public String getUserName() {
		return "srikanya";
	}
	
	@GetMapping("/username")
	public String getMyName() {
		return "durga..";
	}

	@GetMapping("/otp")
	public String getOtp() {
		return "34562";
	}
	@PostMapping("/create")
    public ResponseEntity<Customer> createCustomer(@RequestBody  Customer customer){
    	Customer cust = customerService.createCustomer(customer);
    	
    	return new ResponseEntity<Customer>(cust,HttpStatus.CREATED);
    }
	
	
	@GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllCustomers(){
    	List<Customer> custList = customerService.getAllCustomers();
    	
    	return new ResponseEntity<List<Customer>>(custList,HttpStatus.OK);
    }
}
