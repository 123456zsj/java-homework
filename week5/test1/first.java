package week5;

import java.util.Scanner;

public class first {
	public static void main(String[] args) {
		//键盘输入相关的信息
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入项目名称");
		String projectName = scan.next();
		System.out.println("请输入项目的预算");
		double budget = scan.nextDouble();

		System.out.println("请输入项目员工1的姓名");
		String emp1Name = scan.next();
		System.out.println("请输入员工1部门");
		String emp1department = scan.next();
		System.out.println("请输入员工1薪水");
		double emp1budget = scan.nextDouble();

		System.out.println("请输入项目员工2的姓名");
		String emp2Name = scan.next();
		System.out.println("请输入员工2部门");
		String emp2department = scan.next();
		System.out.println("请输入员工2薪水");
		double emp2budget = scan.nextDouble();

		Employee emp1 = new Employee(emp1department,emp1Name,emp1budget);
		Employee emp2 = new Employee(emp2department,emp2Name,emp2budget);

		Project project = new Project(projectName,budget,emp1,emp2);
		project.updateBudget();

		System.out.println("新预算为="+project.getBudget());
		System.out.println(project.toString());
	}
}