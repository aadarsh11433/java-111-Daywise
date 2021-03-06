package Problem2;

public abstract class Employee {

	 protected int employeeId;
	 protected String employeeName;
	 protected double salary;
	
	 
	 
	 public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	abstract void calculateSalary();
	 
	 public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	 
	 
	 
	 
	 
	 
	 
	 
}
/*      
 * 
 *   
 *   Q2)Create an Employee class with the following protected fields:


employeeId: Integer
employeeName: String
salary: double


Use appropriate getter setter methods.
Write a public 2 argument constructor with arguments ? employeeId, and
employeeName.
Write an abstract method inside the Employee class
calculateSalary: void



Create another class PermanentEmployee as a child of the above Employee class and
inside this class define one private field
basicPay: double
Define a 3 parameter constructor inside this class to take (employeeId, employeeName
and basicPay).
Implement the calculateSalary method in PermanentEmployee class as
      
      salary = basicPay ? PF amount;
Set this value to the salary attribute.
Here PF Amount = basicPay * 0.12
Create another class TemporaryEmployee as a child of Employee class with the
following private fields:
hoursWorked: Integer
hourlyWages: Integer
Define a 4 argument constructor with arguments ? employeeId, employeeName,
hoursWorked and hourlyWages.

Implement the calculateSalary method in TemporaryEmployee class as
salary = hoursWorked * hourlyWages
Set this value to the salary attribute.
Develop a class Loan inside this Loan class define a method calculateLoanAmount as
follows:
public double calculateLoanAmount(Employee employeeObj)
This method should calculate the loan amount and return that amount.
Provide the implementation for this method as mentioned below
Loan amount is calculated as follows :If the Employee object is of type PermanentEmployee then
loan amount should be
15% of the salary.
If the Employee object is of type TemporaryEmployee then loan amount should be
10% of the salary.

Note: Inside the Loan class make sure to have a private
constructor

Define a Main class with the main method and inside the main method, get the Loan
class object and call the calculateLoanAmount() method 3 times:
1. by supplying PermanentEmployee object
2. by supplying TemporaryEmployee object
3. by supplying a null value
and display the appropriate result.
 */



