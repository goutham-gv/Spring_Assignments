package com.springmvc.com;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class User {
	@NotNull
    private String userName;
	@NotNull
	@Size(min=1,message="required")  
    private String password;
    @NotNull
    private String email;
    @NotNull
    private String city;
    @NotNull
    private int pinCode;
    @NotNull
    private int contact;

    public String getUserName() {
        return userName;
    }

    public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
