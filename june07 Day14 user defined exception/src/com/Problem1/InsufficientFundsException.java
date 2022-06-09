package com.Problem1;

public class InsufficientFundsException extends  java.lang.Exception{

	String message ;
	
	public InsufficientFundsException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		
		return this.message;
	}
}
