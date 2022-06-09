package com.Problem1;

public class Account {

	 String accountNumber;
	double balance ;
	
	public Account(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}
	void deposit(double amount) {
		
		this.balance +=amount;
		
		System.out.println("Your updated Account balance is : "+this.balance);
		
	}
	 double withdraw(double amount) throws InsufficientFundsException{
	
		 if(this.balance>amount ) {
			
			 this.balance = this.balance - amount;
			
			 System.out.println("Withdrawal successful");
			
			 System.out.println("Your updated Account balance is : "+this.balance);
			 
			 return amount;
		 }
		 else{
			
			 InsufficientFundsException ife;
			 ife = new InsufficientFundsException("passed Withdrawal amount is more than balance");
			  
			 throw ife;
		 }
	}

}
