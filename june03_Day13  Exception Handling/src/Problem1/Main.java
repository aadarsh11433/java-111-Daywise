package Problem1;

 import java.util.InputMismatchException;
import java.util.Scanner;

 class Main {

	 public static void main(String args[]) {

		 System.out.println("start of main..");

		 Scanner sc = new Scanner(System.in);

	
		 try {
			 System.out.println("Enter num1");

			 int num1 = sc.nextInt();

			 System.out.println("Enter num2");

			 int num2 = sc.nextInt();

			 String message = null;

			 int num3 = num1 / num2;

			 if(num3 > 10){

				 message = "Welcome to Exception Handling ";

			 }

			 System.out.println("Message is :"+message.toUpperCase());
		 }
		 catch (InputMismatchException e) {
			
			 System.out.println("Please enter valid number");
			 System.out.println(e);
		}
		 catch (ArithmeticException e) {
			 System.out.println("num2 should not be 0");
			 System.out.println(e);
		}
		 catch (NullPointerException e) {
			 System.out.println("String value is null");
			 System.out.println(e);
		}
		 catch (Exception e) {
	         System.out.println(e);
		}
		 
		 

		 System.out.println("end of main");

	  }
  }
 
 /*   
  
                           If user enter any string instead of number then it should show
                           ?Please enter valid number?

                          If user will enter num2 as 0 then it should show following message inside the catch
                          block
                          ?num2 should not be 0?
                          if the output of the expression num3 > 10 returns false then should show following
                          message inside the catch block:
                           ?String value is null?
                          Otherwise it should print following message:
                          ?Message is :WELCOME TO EXCEPTION HANDLING?
                          
                           
*/                           
