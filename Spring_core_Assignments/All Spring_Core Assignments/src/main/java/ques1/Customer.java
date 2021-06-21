package ques1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int customerId;
	private String customerName;
	private double customerContact;
	@Autowired
	private Address customerAddress;
	
	public int getCustomerId() {
		return 64166;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return "Goutham";
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getCustomerContact() {
		return 979123390;
	}
	public void setCustomerContact(double customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public void customerDetails()
	{
		System.out.println("Customer ID is =" + getCustomerId());
		System.out.println("Customer Name is =" + getCustomerName());
		System.out.println("Customer Contact Number is =" + getCustomerContact());
		System.out.println("Address of the Customer is =" + getCustomerAddress().getCity()+ " " + getCustomerAddress().getCountry()+ " " + getCustomerAddress().getZip() +" " +getCustomerAddress().getState() + " " +getCustomerAddress().getStreet());
	} 
}
