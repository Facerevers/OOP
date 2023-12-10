package model;
import java.util.List;
public class EducationGroup{
	private Teacher teacher;
	private List<Student> studentList;
	public EducationGroup(Teacher teacher, List<Student> studentList){
		this.teacher = teacher;
		this.studentList = studentList;
	}
	public Teacher getTeacher(){
		return teacher;
	}
	public void setTeacher(Teacher teacher){
		this.teacher = teacher;
	}
	public List<Student> getStudentList(){
		return studentList;
	}
	public void setStudentList(List<Student> studentList){
		this.studentList = studentList;
	}
}