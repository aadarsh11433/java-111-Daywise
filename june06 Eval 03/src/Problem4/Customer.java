package Problem4;

public class Customer {

	private String username;
	private String  password;
	
	private String mobilNumber;
	private String email;
	
	
	public Customer() {
		super();
	}
	public Customer(String username, String password, String mobilNumber, String email) {
		super();
		this.username = username;
		this.password = password;
		this.mobilNumber = mobilNumber;
		this.email = email;
	}
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getMobilNumber() {
		return mobilNumber;
	}
	public void setMobilNumber(String mobilNumber) {
		this.mobilNumber = mobilNumber;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
/*             



Q4)Create a Customer bean class with the following fields:
username: String
password: String
mobileNumber: String
email: String

Create a Demo class with the main method and perform the following tasks:
Take the input from the user and create an object of the Customer with all the details.
Make sure that to perform the following input validations:
username: should contain only alphabets and length should be min 3 and max 8
characters.
password: should be alpha-numeric and also min 3 and max 8 characters.
mobileNumber: should be an Indian mobile number starting with 6,7,8,9 and the
length should be 10.
email: a valid email address.

If all input fields are valid then only create an object of Customer and print all the details from the
Customer object.
otherwise, print the appropriate validation error message.


*/