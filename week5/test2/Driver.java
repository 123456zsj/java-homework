package project2;

import java.util.Scanner;

public class Driver {
	private static ClassList list = null;
	public static void main(String[] args) {
		int choose = menu();
		int a = 0;
		while(choose!=3){
			switch(choose){
			case 1:
				if(list==null){
					createList();
				}else{
					System.out.println("是否需要重新创建？");
					System.out.println("输入0不需要，输入1需要");
					Scanner scan2 = new Scanner(System.in);
					a = scan2.nextInt();
					if(a==1){
						list = null;
					}
				}
				break;
			case 2:
				if(list==null){
					System.out.println("请先完成第一步！");
					break;
				}
				printList();
				break;
			default:System.out.println("无效的选择");
			}
			choose = menu();	
		}
		System.out.println("欢迎下次使用！");
	}

	public static int menu(){
		int choose = 0;
		Scanner scan1  = new Scanner(System.in);
		System.out.println("1.Create Attendance List");
		System.out.println("2.Print Attendance List");
		System.out.println("3.Exit");
		choose = scan1.nextInt();
		return choose;
	}

	public static void createList(){
		Scanner scan = new Scanner(System.in);

		System.out.println("请输入学期");
		int semester = scan.nextInt();
		System.out.println("请输入year");
		int year = scan.nextInt();
		System.out.println("课程号");
		String subjectID = scan.next();
		System.out.println("课程名");
		String subjectName = scan.next();

		System.out.println("请输入学生1ID");
		String ID1 = scan.next();
		System.out.println("请输入学生1的姓");
		String firstName1 = scan.next();
		System.out.println("请输入学生1的名");
		String lastName1 = scan.next();

		System.out.println("请输入学生2ID");
		String ID2 = scan.next();
		System.out.println("请输入学生2的姓");
		String firstName2 = scan.next();
		System.out.println("请输入学生2的名");
		String lastName2 = scan.next();

		Student student1 = new Student(ID1,firstName1,lastName1);
		Student student2 = new Student(ID2,firstName2,lastName2);

		Subject subject = new Subject(subjectID,subjectName);

		list = new ClassList(semester,year,subject,student1,student2);

	}

	public static void printList(){
		System.out.println(list.toString());
	}

}