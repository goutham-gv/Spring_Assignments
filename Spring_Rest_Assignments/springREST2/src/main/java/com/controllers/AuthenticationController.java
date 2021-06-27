package com.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userModel.UserModel;

@RestController
public class AuthenticationController 

{	@RequestMapping("/auth.html")
	public String userAuth(@ModelAttribute("userModel1") UserModel userModel1)
	{
		boolean isValid=check(userModel1.getUsername(),userModel1.getPassword());
			if (isValid)	
			{
				return "Valid User";
				
			}
			else
			{
				return "Invalid User";
			}
	}

	private boolean check(String username, String password) {
		// TODO Auto-generated method stub
		if(username.contentEquals("goutham") && password.contentEquals("nivass"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
