package student;

public class Student {
	private String name, campus, major;
	private int  grade, studentId;
	
	public Student(String name, String campus, String major, int grade, int studentId){
		this.name = name;
		this.campus = campus;
		this.major = major;
		this.grade = grade;
		this.studentId = studentId;
	}
	public String info() {
		return "�̸�: " + name+ ", �г�: " + grade+ "ķ�۽�: "+ campus+ "�а�: "+major+ "�й�: " +studentId;
	}
}
