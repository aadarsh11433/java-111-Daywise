package com.Problem3;

public class Main {
	
	final int finalInt = 20;

	public static void main(String[] args) {
		
		
		Main ob = new Main();
		System.out.println(ob.finalInt);
		
//		ob.finalInt =40;  // final field can't be reassigned

	}

}
 final class Human{
	 
 }
 
// class Men extends Human{        //no class can subclass a final class
//	 
// }
 class auto{
	 
	 final void engine(){
		 
		 System.out.println("Engine method");
	 }
 }
 class car extends auto{
       
//	 @Override
//	 final void engine(){                       can not override a final method in subclass.
//		 
//		 System.out.println("Engine method");
//	 }
	 
 }
 
 
 
 
 /*                   <<------------------------  final Keyword-------------------------->>             
 
                   FINAL VARIABLE--->
                   When we make any variable as final, we cannot change the value of final variable(It will be constant).
                  
                   ** we can either initialize while declaring or by assigning via constructor.
                   *
                   ** once initialized its value can't be changed. 
                      LINE 5 has final variable 
                      LINE 13 reassigning final variable throwing error.
                      
                   ** can be used in cases were a particular variable is constant in nature like 
                      * Account_number , Mobile,rollno. etc which do not change unlike acc. balance.    
                      
                      
                  FINAL METHOD ---->
                  **    if we mark as method as final it means it cant be overriden in the child class.
                     
                  **    If we want same implementation throughout all the derived classes
                        than we should declare the super class method as final.
                        
                       (LINE 27 )has a final method foe which we cant use mehod overriding 
                       in LINE 35 
                       
                       
                       
                 FINAL CLASS -->
                 -----------
                 
                 ---->  Final classes cant be extended .
                  
                  ----> in class final keyword prevents the inheritence.
                  
                  ---->  a final class if implements any interface which has abstract methods
                         than it has to implement those method it cant be an abstract class in that case.
                 
                     ex.  (LINE 18 -24 )
 
 
 
 
 
 
 
 */