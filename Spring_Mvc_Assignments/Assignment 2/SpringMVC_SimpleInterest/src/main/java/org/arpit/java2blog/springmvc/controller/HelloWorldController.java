
package org.arpit.java2blog.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/helloworld")
	public ModelAndView hello() {

		String helloWorldMessage = "Hello world Assisgnment 1 Completed!";
		return new ModelAndView("hello", "message", helloWorldMessage);
	}
	@RequestMapping("/about")
	public ModelAndView about(HttpServletRequest request , HttpServletResponse response)
	{   
		int result1 = Integer.parseInt(request.getParameter("t1"));
		int result2 = Integer.parseInt(request.getParameter("t2"));
		int result3 = Integer.parseInt(request.getParameter("t3"));
		float sim = (result1+result2+result3) % 100;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("about");
		mv.addObject("result", sim);
		System.out.println("this is about page");
		return mv;
	}
}

