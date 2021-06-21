package com.springmvc.com;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/hello")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("emp", new Employee());
		
		return "viewpage";
	}
	
	@RequestMapping("/helloagain")
	public String processForm(
			@Valid @ModelAttribute("emp") Employee emp,
			BindingResult br) {
				
		if (br.hasErrors()) {
			return "viewpage";
		}
		else {
			return "success";
		}
	}
}