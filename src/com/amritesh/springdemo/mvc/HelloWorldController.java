package com.amritesh.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	// Read form data and add that data in Model
	@RequestMapping(value="/processFormVersion2")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		name = "Yo! " + name;
		model.addAttribute("message", name);
		return "helloworld";
	}
}