package com.Problem3;

public class Demo {

	public static void main(String[] args) {
		
		try {
			
			int a =100;
			int b =10;
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e){
			
			System.out.println(e.getMessage());
		}finally {
			System.out.println("no exception found  in first try catch finally block");
			System.out.println("In the first finally block");
		}
		
		
		

		try {
			System.out.println("in the second try catch finally block");
			
			int a =100;
			int b =0;
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ae){
			
			System.out.println(ae.getMessage());
		}finally {
			System.out.println("exception found  in second try catch finally block");
			System.out.println("In the second finally block");
		}

		
		// example 3
		
				try {
					
					System.out.println("in the example 4");
					
					return ;
					
					
					
				}catch (Exception e) {
				
					  System.out.println(e);
				}
				finally {
					System.out.println("in the finally of try catch block where try has return keyword");
				}
				
			
				// example 4
				
				try {
					int a = 1/0;
				}catch (NullPointerException e) {
				
					// null pointer exception is not possible  here
				}   // skipping the corresponding exception i.e. Arithmetic exception  
				finally {
					System.out.println("in the finally of try catch block where appropriate exception catcher is missing");
				}
				
			
				
				
			
		
		
		
		
	}

}

/*      <<--------------------------- FINALLY  -------------------------------->>
                                                                                   
         ----> the finally keyword used with the try catch block.
         
         ----> finally insures that whater=ver code inside its block will execute.
         
         ----> irrespective of the fact that the exception was found or not .
         
         ----> in above given examples first in one example ther wasn't any exception found 
               but finally block run same for the other case were exception was there.
               
         ----> Normally in functions (methods in case of OOPS) when we use word return it
               terminate the function but in java if that return keyword is used in the try or catch 
               block in some method it doesnt terminate directly the complier look for associated finally block if
               its there it execute than terminate the function.
               EXAMPLE --> 3
               
         ----> finally block runs even when there is no catch block for respective exception
                    EXAMPLE --> 4
                    
         ----> used to close resources which were opened in the try block.                                                                          
                                                                                   
                                                                                   
                                                                                   
                                                  
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   
                                                                                   */
                                                                                   
