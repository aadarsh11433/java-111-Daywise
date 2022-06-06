package problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the size of the array ");
		
		try {
			
			int size  = sc.nextInt();
			
			int[] arr = new int[size];
			
			System.out.println("enter elements of the array");
			
			for(int a =0;a<arr.length;a++) {
			
				arr[a] =sc.nextInt();
			}
			
			System.out.println("enter index get th element ");
			int index = sc.nextInt();
			
			System.out.println("element on index "+index+" is : "+ arr[index]);
			
		}
		catch(InputMismatchException e) {
			
			System.out.println("you entered wrong input wrong  of type");
			System.out.println(e);
			
		}
        catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("you entered wrong input wrong  of type");
			System.out.println(e);
			
		}catch(Exception e) {
			
			System.out.println("you entered wrong input wrong  of type");
			System.out.println(e);
		}
		
		

	}

}
