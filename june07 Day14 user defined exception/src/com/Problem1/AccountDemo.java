package com.Problem1;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		Account account = new Account("4512325689456");
		
		System.out.println("Enter amount to depsit in account");
		
		double depositAmount = sc.nextDouble();
		
		account.deposit(depositAmount);  // depositing the entered amount in the account
		

		System.out.println("Enter amount to withdraw from  account");
		
		try {
			
			double withdrawAmount = sc.nextDouble();
			
			double amount = account.withdraw(withdrawAmount);
			
			System.out.println("withdrawl amount : "+amount);
			
		}
		catch (InsufficientFundsException e) {
			
			System.out.println(e);
			
			
		}finally {
			
			System.out.println("Thank you for using our banking services");
			
		}
		
		
		System.out.println("Gracefully terminated......");
		
	}

}
