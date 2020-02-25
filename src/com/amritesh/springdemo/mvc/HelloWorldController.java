package com.amritesh.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping(value="/showForm")
	public String showForm() { 	
		return "helloworld-form";
	}
	
	@RequestMapping(value="/processForm")
	public String processForm() {
		return "helloworld";
	}
	
}