package com.casestudy.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Customer {
	@Id
	@Field
	private String id;
	@Field
	private String FirstName;
	@Field
	private String lastName;
	@Field
	private boolean Reugular;
	
	public boolean isReugular() {
		return Reugular;
	}

	public void setReugular(boolean reugular) {
		Reugular = reugular;
	}

	public Customer() {}
	

	

	public Customer(String id, String firstName, String lastName, boolean reugular) {
		this.id = id;
		FirstName = firstName;
		this.lastName = lastName;
		Reugular = reugular;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return String.format("Student [id=" + id + ", FirstName=" + FirstName + ", lastName=" + lastName + "]", id,FirstName,lastName) ;
	}
	 
}
