package ques8;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String street;
	private String city;
	private String state;
	private int zip;
	private String country;
	
	public String getStreet() {
		return "2nd Street";
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return "Coimbatore";
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return "TamilNadu";
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return 64166;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return "India";
	}
	public void setCountry(String country) {
		this.country = country;
	}
}

