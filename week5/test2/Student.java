package week5;


public class Student {
	private String studentID;
	private String firstName;
	private String lastName;

	public Student(){

	}

	public Student(String a,String b,String c){
		this.studentID = a;
		this.firstName = b;
		this.lastName = c;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
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

	public String toString() {
		return this.studentID+"\t"+this.firstName+"\t"+this.lastName;
	}

}