package Problem2;

public class Citizen {

	private String name;
	private String aadharNumber;
	private String mobileNumber;
	

	public Citizen() {
		super();
	}


	
	public Citizen(String name, String aadharNumber, String mobileNumber) {
		super();
		this.name = name;
		this.aadharNumber = aadharNumber;
		this.mobileNumber = mobileNumber;
	}
	
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	
	
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
}
/*              
Create a Citizen bean class with the following fields:
name: String
aadharNumber: String
mobileNumber: String
Create a Demo class with following methods:
public static void main(String[] args);
public boolean validate(String name, String mobileNum, String aadharCard);
Make sure that to perform the following input validations inside validate() method:
name: should contain only alphabets and length should be min 3 and max 8
characters.
aadharNumber: should be numeric and also of length 12.
mobileNumber: should be an Indian mobile number starting with 6,7,8,9 and the
length should be 10.
Take the input from the user and create an object of the Citizen with all the details.

If all input fields are valid then only create an object of Citizen and print all the details from the
Citizen object.
otherwise, print the appropriate validation error message.

*/