package com.Problem2;

import java.util.Scanner;

public class UserRegistration {
	
	
	void registerUser(String usernameString , String userCountry) throws InvalidCountryException{
		
		
		if(userCountry.equalsIgnoreCase("india")) {
			
			
			System.out.println("User registration done successfully");
		}
		else {
			
			InvalidCountryException ice ;
			ice = new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
		}
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		UserRegistration userReg = new UserRegistration();
		
		System.out.println("Welcome to Registration Portal");
		
		System.out.println("Enter name of the user");
		String name=sc.next();
		
		
		System.out.println("Enter country of the user");
		String country =sc.next();

		try {
			userReg.registerUser(name, country);
			
			System.out.println("Thank you for registering");
			
		}catch (InvalidCountryException e) {
			
			System.out.println(e.getmessage());
			System.out.println("sorry for your inconvinience");
			
		}finally {
			System.out.println("Come again");
		}
		
		
		
		System.out.println("Gracefull termination");
	}

}
