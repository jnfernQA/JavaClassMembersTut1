package com.qa.main;

public class Runner {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		System.out.println(Customer.getnumberOfPeople());
		
		Customer firstCustomer = new Customer("Arnold", "Rimmer");
		Customer secondCustomer = new Customer("David","Lister");
		
		firstCustomer.setfirstName("Arnold J.");
		secondCustomer.setfirstName("Dave");
		
		System.out.println(firstCustomer.getfirstName());
		System.out.println(secondCustomer.getfirstName());
		System.out.println(firstCustomer.getSurname());
		System.out.println(secondCustomer.getSurname());
		
		System.out.println(firstCustomer.getnumberOfPeople());
		System.out.println(secondCustomer.getnumberOfPeople());
		System.out.println(Customer.getnumberOfPeople());
	
	}

}
