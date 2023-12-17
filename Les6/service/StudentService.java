package service;
import java.util.ArrayList;
import java.util.List;
import model.Student;
public class StudentService implements UserService<Student>{
	private final List<Student> studentList = newArrayList<>();
	@Override
	public void create(String firstName, String secondName, String lastName){
		double averageMark;
		averageMark = Math.random() * 3 + 2;
		int maxId = 0;
		for(Student student : studentList)
			if(maxId < student.getStudentId())
				maxId = student.getStudentId();
		studentList.add(new Student(++maxId, firstName, secondName, lastName, averageMark));
	}
	public List<Student> getStudentList(){
		return studentList;
	}
	public void setStudentList(List<Student> studentList){
		this.studentList = studentList;
	}
}