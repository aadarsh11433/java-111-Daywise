package Problem2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	
	public boolean validate(String name, String mobileNum, String aadharCard) {
		
		boolean checkName = Pattern.matches("[a-zA-Z]{3,8}", name);
		
		boolean checkMobile = Pattern.matches("[6-9][0-9]{9}", mobileNum);
		
		boolean checkAadhar = Pattern.matches("[0-9]{12}", aadharCard);
		
		if(checkAadhar && checkMobile && checkName)
		return true;
		else {
			if(!checkAadhar) {
				System.out.println(" Entered Adhar number doesnt fullfill the validity criteria");
			}
			if(!checkMobile) {
				System.out.println(" Entered Mobile number is not valid");
			}
			if(!checkName) {
				System.out.println("passed name is not a proper name");
				
			}
			
			
			return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
        System.out.println("Enter name of the user");
        String name = sc.next();
        
        System.out.println("Enter Aadhar no. of the user");
        String aadhar = sc.next();
        
        
        System.out.println("Enter Mobile no. of the user");
        String mobile = sc.next();
        
        
        boolean flag = (new Demo()).validate(name, mobile, aadhar);
        
        if(flag) {
        	Citizen citizen1 =new Citizen(name, aadhar, mobile);
        	System.out.println("Citizen's name is : "+citizen1.getName());
        	
        	System.out.println("Citizen's mobile no. is : "+citizen1.getMobileNumber());
        	
        	System.out.println("Citizen's Aadhar no. is : "+citizen1.getAadharNumber());
        }
        else {
		       System.out.println("object couldn't  created due to above reason/s");	
		}
        
	}

}
