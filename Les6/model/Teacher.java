package model;
public class Teacher implements Comparable<Teacher>{
	private int teacherId;
	public Teacher(int teacherId, String firstName, String secondName, String lastName){
		super(firstName, secondName, lastName)
		this.teacherId = teacherId;
	}	
	public int getTeacherId(){
		return teacherId;
	}
	public void setTeacherId(int teacherId){
		this.teacherId = teacherId;
	}
	@Override
	public String toString(){
		return "Teacher{" + "teacherId=" + teacherId + ", firstName='" + super.getFirstName() + '\'' + ", secondName='" + super.getSecondName() + '\'' + ", lastName='" + super.getLastName() + '\'' + '}';
	}
	@Override
	public int compareTo(Teacher o){
		if(studentId > o.getTeacherId()){
			return 1;
		} elsse if(studentId < o.getTeacherId()){
			return -1;
		}
		return 0;
	}
}