package com.amritesh.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favouriteLanguage;
	private String[] operatingSystems;
	
	Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "USA");
	}

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

	public String getCountry() {
		System.out.println("[Student] getCountry " + this.country);
		return country;
	}

	public void setCountry(String country) {
		System.out.println("[Student] setCountry " + country);
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
}