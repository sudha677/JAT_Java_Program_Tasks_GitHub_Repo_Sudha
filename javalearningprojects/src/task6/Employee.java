package javalearningprojects.src.task6;

public class Employee {
	private int ID;
	private String firstName;
	private String lastName;
	private double salary;	
	public static double annualSalary;
	public double raisedSalary;


	/**
	 * @param iD
	 * @param firstName
	 * @param lastName
	 * @param salary
	 */
	public Employee(int iD, String firstName, String lastName, double salary) {
		super();
		ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}



	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}


	public double getAnnualSalary() {
		
		return annualSalary = getSalary() * 12;
	}
	
	public double raiseSalary(int percent){
		
		raisedSalary = annualSalary * percent/100;
		
		return raisedSalary;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee(07, "Sidharth", "Suresh", 100000.25);
		emp.getAnnualSalary();
		emp.raiseSalary(20);
		
		System.out.println("Employee ID: "+emp.ID);
		System.out.println("Employee FirstName: "+emp.firstName);
		System.out.println("Employee LastName: "+emp.lastName);
		System.out.println("Employee Salary: "+emp.salary);
		System.out.println("Employee Annual Salary: "+Employee.annualSalary);
		System.out.println("Employee Raised Salary: "+emp.raisedSalary);

	}

}
