package week5;

public class Subject {
	private String subjectID;
	private String subjectName;

	public Subject(){

	}

	public Subject(String a,String b){
		subjectID = a;
		subjectName = b;
	}

	public String getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String toString() {
		String info = "";
		info = "�γ̴���:"+this.subjectID+"\t"+"�γ�����:"+this.subjectName;
		return info;
	}


}