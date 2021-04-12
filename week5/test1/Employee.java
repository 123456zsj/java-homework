package week5;

public class Employee {

	private String department;
	private String name;
	private double baseSalary;

	public Employee(){

	}

	public Employee(String department,String name,double baseSalary){
		this.department = department;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public String toString() {
		return "Employee [department=" + department + ", name=" + name + ", baseSalary=" + baseSalary + "]";
	}
}