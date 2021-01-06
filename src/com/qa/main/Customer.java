package com.qa.main;

public class Customer {
	 String firstName;
	 String surname;
	 static int numberOfPeople = 0;
	
	public Customer(String firstName, String surname) {
		this.firstName = firstName;
		this.surname = surname;
		numberOfPeople++;
	}
	
	public static int getnumberOfPeople() {
		return numberOfPeople;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
		
	}

}
