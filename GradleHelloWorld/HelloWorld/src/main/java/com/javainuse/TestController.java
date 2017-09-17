package com.javainuse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping("/welcome.html")
	public ModelAndView firstPage() {
		//return "Hello";
		System.out.print("SprintBootControllerHello");
		return new ModelAndView("welcome");
	}

}