package com.casestudy.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.casestudy.demo.model.Customer;
import com.casestudy.demo.repository.CustomerRepository;
import com.casestudy.demo.service.StudentService;



@RestController
public class CustomerController {
   
	private final CustomerRepository customerRepository;
	
	@Autowired
	public CustomerController(CustomerRepository customerRepository)
	{
		this.customerRepository= customerRepository;
	}
	
	  
	@GetMapping("/users")
	public List<Customer> getCustomer(){
		return customerRepository.findAll();
	}
	
	@PostMapping(value="/users/add" )
    public Customer insertCustomer(@RequestBody Customer e) {
         return customerRepository.insert(e);
	}
	
	@GetMapping(value= "/users/{customer-id}")
    public Optional<Customer> getStudent(@PathVariable(value= "customer-id") String id) {
        return customerRepository.findById(id);
    }
	
	 @DeleteMapping("/users/delete/{delete-id}")
	    public void deleteCustomer(@PathVariable(value= "delete-id") String id) {
	        customerRepository.deleteById(id);
	    }
}
