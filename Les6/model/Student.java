package model;
public class Student extends User implements Comparable<Student>{
	private int studentId;
	private double averageMark;
	public Student(int studentId, String firstName, String secondName, String lastName, double averageMark){
		super(firstName, secondName, lastName)
		this.studentId = studentId;
		this.averageMark = averageMark;
	}	
	public int getStudentId(){
		return studentId;
	}
	public void setStudentId(int studentId){
		this.studentId = studentId;
	}
	public double getAverageMark(){
		return averageMark;
	}
	public void setAverageMark(double averageMark){
		this.averageMark = averageMark;
	}
	@Override
	public String toString(){
		return "Student{" + "studentId=" + studentId + ", firstName='" + super.getFirstName() + '\'' + ", secondName='" + super.getSecondName() + '\'' + ", lastName='" + super.getLastName() + ", average mark =" + String.format("%.2f", averageMark) + '\'' + '}';
	}
	@Override
	public int compareTo(Student o){
		if(studentId > o.getStudentId()){
			return 1;
		} elsse if(studentId < o.getStudentId()){
			return -1;
		}
		return 0;
	}
}