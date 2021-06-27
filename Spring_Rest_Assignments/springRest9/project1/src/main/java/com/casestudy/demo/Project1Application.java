package com.casestudy.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.casestudy.demo.model.Customer;
import com.casestudy.demo.repository.CustomerRepository;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Project1Application implements CommandLineRunner {
	
	
	private final CustomerRepository CustomerRepositary ;
	@Autowired
	public Project1Application(CustomerRepository CustomerRepositary)
	{
		this.CustomerRepositary = CustomerRepositary;
	}

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
	}
	
	
	@Override
	public void run(String...args)throws Exception
	{
		if(CustomerRepositary.findAll().isEmpty())
		{
			CustomerRepositary.save(new Customer("101","Goutham","Nivass",false));
			CustomerRepositary.save(new Customer("102","Walter","Vetrivel",true));
			CustomerRepositary.save(new Customer("103","Maran","Raja",true));
		}
		
		for(Customer customer : CustomerRepositary.findAll())
		{
			System.out.println(customer);
		}
	}

}
