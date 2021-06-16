package ques8;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.beans.Beans;

import org.springframework.beans.BeansException;
import org.springframework.stereotype.Component;

@Component

public class Customer implements InitializingBean,DisposableBean{
	private int customerId;
	private String customerName;
	private int customerContact;

	@Autowired
	private Address customerAddress;
	
	
	public int getCustomerId() {
		return 100;
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
	public int getCustomerContact() {
		return 2632230;
	}
	public void setCustomerContact(int customerContact) {
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
	
	public void afterPropertiesSet() throws BeansException {
		
		System.out.println("Initializing method for rectangle");
		
	}
	public void destroy() throws Exception {
		System.out.println("Disposable Destroy method called for rectangle");
	}
	
}
