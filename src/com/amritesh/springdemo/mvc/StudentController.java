package com.amritesh.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/student")
public class StudentController {

	@RequestMapping(value="/showForm")
	public String showForm(Model model) {
		Student student = new Student();
		System.out.println("Created New Student Object");
		model.addAttribute("student", student);
		System.out.println("Added New Student Object To Medel");
		return "student-form";
	}
	
	@RequestMapping(value="processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		System.out.println("Student :: " + student.getFirstName() + " " + student.getLastName());
		return "student-confirmation";
	}
}