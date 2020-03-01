package com.amritesh.springdemo.mvc;

public class Student {
	private String firstName = "amritesh";
	private String lastName = "chandan";
	
	Student() {}

	public String getFirstName() {
		System.out.println("[Student] getFirstName " + this.firstName);
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("[Student] setFirstName " + firstName);
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("[Student] getLastName " + this.lastName);
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("[Student] setLastName " + lastName);
		this.lastName = lastName;
	}
	
}