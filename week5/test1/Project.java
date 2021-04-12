package week5;

public class Project {
	private String projectName;
	private double budget;
	private Employee emp1;
	private Employee emp2;

	public Project(){

	}

	public Project(String projectName,double budget,Employee emp1,Employee emp2){
		this.projectName = projectName;
		this.budget = budget;
		this.emp1 = emp1;
		this.emp2 = emp2;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public Employee getEmp1() {
		return emp1;
	}

	public void setEmp1(Employee emp1) {
		this.emp1 = emp1;
	}

	public Employee getEmp2() {
		return emp2;
	}

	public void setEmp2(Employee emp2) {
		this.emp2 = emp2;
	}

	public void updateBudget(){
		this.budget = this.budget * (1+0.2);
		//this.getBudget(this.getBudget()*(1+0.2));
	}

	public String toString(){
		String info = "";
		info = "projectName="+this.projectName+"budget="+this.budget+"\n"
				+"emp1="+this.emp1.toString()+"\n"+"emp2="+this.emp2.toString();
		return info;
	}
}