package week5;

import java.util.Scanner;

public class first {
	public static void main(String[] args) {
		//����������ص���Ϣ
		Scanner scan = new Scanner(System.in);
		System.out.println("��������Ŀ����");
		String projectName = scan.next();
		System.out.println("��������Ŀ��Ԥ��");
		double budget = scan.nextDouble();

		System.out.println("��������ĿԱ��1������");
		String emp1Name = scan.next();
		System.out.println("������Ա��1����");
		String emp1department = scan.next();
		System.out.println("������Ա��1нˮ");
		double emp1budget = scan.nextDouble();

		System.out.println("��������ĿԱ��2������");
		String emp2Name = scan.next();
		System.out.println("������Ա��2����");
		String emp2department = scan.next();
		System.out.println("������Ա��2нˮ");
		double emp2budget = scan.nextDouble();

		Employee emp1 = new Employee(emp1department,emp1Name,emp1budget);
		Employee emp2 = new Employee(emp2department,emp2Name,emp2budget);

		Project project = new Project(projectName,budget,emp1,emp2);
		project.updateBudget();

		System.out.println("��Ԥ��Ϊ="+project.getBudget());
		System.out.println(project.toString());
	}
}