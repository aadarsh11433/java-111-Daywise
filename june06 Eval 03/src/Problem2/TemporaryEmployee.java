package Problem2;

public class TemporaryEmployee extends Employee {

	
	private int hoursWorked;
	private int hourlyWages;
	
	
	public TemporaryEmployee( int hoursWorked, int hourlyWages,int employeeId, String employeeName) {
		super(employeeId, employeeName);
		
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;

	}
	



	@Override
	void calculateSalary() {
		
//		salary = hoursWorked * hourlyWages
		
	}
}
