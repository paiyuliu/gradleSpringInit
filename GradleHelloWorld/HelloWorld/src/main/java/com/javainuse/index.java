package com.javainuse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class index {

	@RequestMapping("/")
	public String helloPage(){
		return "Hello!! Spring World!!";
		
	}
	
	@RequestMapping("/index2")
	public String hello(){
		System.out.println("hello");
		return "index";
		
	}

}