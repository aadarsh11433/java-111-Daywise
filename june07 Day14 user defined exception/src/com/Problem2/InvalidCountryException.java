package com.Problem2;

public class InvalidCountryException extends Exception {

	String message;
	
	
	public InvalidCountryException() {
		super();
		
	}

	
	
	public InvalidCountryException(String message) {
		super();
		this.message = message;
	}


	String getmessage() {
		return this.message;
	}
}
