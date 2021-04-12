package week5;

public class ClassList {
	private int semester;
	private int year;
	private Subject subj;
	private Student s1;
	private Student s2;

	public ClassList(){

	}

	public ClassList(int a,int b,Subject c,Student d,Student e){
		semester = a;
		year = b;
		subj = c;
		s1 = d;
		s2 = e;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Subject getSubj() {
		return subj;
	}

	public void setSubj(Subject subj) {
		this.subj = subj;
	}

	public Student getS1() {
		return s1;
	}

	public void setS1(Student s1) {
		this.s1 = s1;
	}

	public Student getS2() {
		return s2;
	}

	public void setS2(Student s2) {
		this.s2 = s2;
	}

	public String toString() {
		String info = "";
		info = this.year+"学年"+this.semester+"学期\n";
		info+=this.subj.toString();
		info+="\n学号\t姓\t名\n";
		info+="=========================================\n";
		info+=this.s1.toString()+"\n";
		info+=this.s2.toString();
		return info;
	}


}