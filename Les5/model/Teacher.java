package model;
public class Teacher extends User{
	private int teacherId;
	public Teacher(String firstName, String secondName, String lastName, int teacherId){
		super(firstName, secondName, lastName);
		this.teachertId = teacherId;
	}
	public int getTeacherId(){
		return teachertId;
	}
	public void setTeacherId(int teachertId){
		this.teachertId = teachertId;
	}
	@Override
	public String toString(){
		return "Teacher{" + "teachertId=" + teachertId + ", firstName=" + super.getFirstName() + ", secondName=" + super.getSecondName() + ", lastName=" + super.getLastName() + '}';
	}
}