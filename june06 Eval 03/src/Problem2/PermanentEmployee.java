package Problem2;

public class PermanentEmployee extends Employee{

	private double basicPay;

	public PermanentEmployee(double basicPay,int  id ,String name) {
		super(id,name);
		this.basicPay = basicPay;
	}

	

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		
//	    this.salary = basicPay – PF amount;
//	     Set this value to the salary attribute.
//	     Here PF Amount = basicPay * 0.12
		
	} 
	
	
	 
}
