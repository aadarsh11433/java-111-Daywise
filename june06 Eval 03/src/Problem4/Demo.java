package Problem4;

import java.util.*;
import java.util.regex.Pattern;


public class Demo {
	
	static Customer validater(String user,String pass, String mob,String email) {
		
		boolean checkUser = Pattern.matches("[a-zA-z]{3,8}",user);
		
		boolean checkPass =Pattern.matches("[a-zA-Z]", pass) && Pattern.matches("[a-zA-Z0-9]{3,8}", pass) &&  Pattern.matches("[0-9]", pass);
		
		boolean checkMob = Pattern.matches("[6-9][0-9]{9}", mob);
		
		boolean checkEmail = Pattern.matches("[@]", email) && Pattern.matches("[.]", email); // @ .
		
		if(checkEmail && checkMob && checkPass  && checkUser) {
			return new Customer(user,pass,mob,email);
		}
		else {
			
			if(!checkEmail) {
				
				System.out.println("invalid Email");
				
			}

			if(!checkPass) {
				System.out.println("invalid Password");
			}

			if(!checkUser) {
				System.out.println("invalid Username");

			}

			if(!checkMob) {
				System.out.println("invalid mobile number");

			}
		
			
		}
		
		
		
		return null;
	}

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
     
     System.out.println( Pattern.matches("[6-9][0-9]{9}", "8962740260"));
     
     System.out.println("enter username");
     String username = sc.next();
     
     System.out.println("enter password");
     String password = sc.next();
     
     System.out.println("enter mobile");
     String mobile = sc.next();
     
     System.out.println("enter email");
     String email = sc.next();
     
     Customer c = Demo.validater(username, password, mobile, email);
     
     if(c != null) {
    	 
    	 
    	 c.getUsername();
    	 c.getEmail();
    	 c.getMobilNumber();
    	 c.getPassword();
     }
     
   
    
     
	}

}
