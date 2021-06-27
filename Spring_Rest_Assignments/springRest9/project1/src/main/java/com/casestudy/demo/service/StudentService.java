package com.casestudy.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.casestudy.demo.model.Customer;
import com.casestudy.demo.repository.CustomerRepository;


@Service
public class StudentService {
    @Autowired
    private CustomerRepository customerRepository;
     
    public List<Customer> getStudents() {
        return customerRepository.findAll();
    }
     
    public Customer saveStudent(Customer student) {
        return customerRepository.save(student);
    }
     
    public Customer updateStudent(Customer student) {
        return customerRepository.save(student);
    }
     
    public Optional<Customer> getStudent(String id) {
    	return customerRepository.findById(id);
        
    }
    public void  deleteCustomer(String id) {
    	 customerRepository.findById(id);
        
    }
   
 
}