package Notes;



public class Main{
	
	void method1() {
		
		System.out.println("inside mehod1"
				
				+"line change");
	}

	public static void main(String args[]){

		//code that may raise exception

		try {
			
			int data=100/0;

			System.out.println(data);

			
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		
		try {
			
			int a[]=new int[5];
			a[10]=50; //ArrayIndexOutOfBoundsException    &&    IndexOutOfBoundsException

			
			String s=null;
//			System.out.println(s.length());//NullPointerException

			Main ob = null;
//			ob.method1();    //NullPointerException
			
			
			String s2="abc";
			int i=Integer.parseInt(s2);//NumberFormatException
			
		}
	    catch(NullPointerException ec) {
	    	System.out.println(ec);
	    }
		catch (NumberFormatException ec) {
			// TODO: handle exception
			
			System.out.println(ec);
		}catch(IndexOutOfBoundsException a) {
			
			System.out.println(a);
		}

		
		
		
		try{
			//code that may raise exception
			
			int data=100/0;
			
			System.out.println(data);
			
		}
		
		catch(Exception e){ //Exception class is the parent class of ArithmaticException class
		
			System.out.println(e+"    in line 64");
			
		}
		
		//rest code of the program
		
		System.out.println("rest of the code...");
		
	System.out.println("================");
	
	
	try{
		int a[]=new int[5];
		a[6]=30/5;
		System.out.println("End of try");
		}
		catch(ArithmeticException e)
		{
		System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}
		catch(Exception e)
		{
		System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");

	}
	
}	


