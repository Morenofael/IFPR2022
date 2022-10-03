package objects;

public class Worker {
	private String firstName;
	private String lastName;
	private Float salary;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Worker(String firstName, String lastName, Float salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public void printSalary() {
		System.out.println(this.firstName + " "+this.lastName + ": R$" + 13*this.salary);
	}
	
}
	
