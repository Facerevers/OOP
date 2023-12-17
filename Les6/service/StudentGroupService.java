package service;
import java.util.ArrayList;
import java.util.List;
import model.Student;
import sort.StudentGroup;
import sort.UserComparator;
public class StudentGroupService{
	private StudentGroup studentGroup;
	public StudentGroupService(SudentGroup studentGroup){
		this.studentGroup = studentGroup;
	}
	public StudentGroup getStudentGroup(){
		return studentGroup;
	}
	public List<Student> getSortedStudentGroup(){
		List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
		Collections.sort(studentList);
		return studentList;
	}
	public List<Student> getSortedStudentGroupByFIO(){
		List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
		studentList.sort(new UserComparator<Student>());
		return studentList;
	}
}