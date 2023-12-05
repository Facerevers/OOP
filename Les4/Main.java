import java.util.ArrayList;
import java.util.List;
public class Main{
	public static void main(String[] args){
		StudentControler controler = new StudentControler();
		controler.create("aab", "aab", "aab");
		controler.create("aaa", "aaa", "aaa");
		controler.create("Aaa", "Aaa", "Aaa");
		controler.create("bbb", "bbb", "bbb");
		controler.sendOnConsole();
		/*
		Student student1 = new Student(4, "aab", "aab", "aab");
		Student student2 = new Student(2, "aaa", "aaa", "aaa");
		Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
		Student student4 = new Student(1, "bbb", "bbb", "bbb");
		List<Student> studentList = new ArrayList<>();
		StudentGroup studentGroup = new StudentGroup(studentList);
		studentGroup.addStudent(student1);
		studentGroup.addStudent(student2);
		studentGroup.addStudent(student3);
		studentGroup.addStudent(student4);
		StudentGroupService service = new StudentGroupService(studentGroup);
		for(Student student : studentGroup){
			System.out.println(student);
		}
		System.out.println();
		StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println();
		for(Student student : service.getSortedStudentGroup()){
			System.out.println(student);
		}
		System.out.println();
		for(Student student : service.getSortedStudentGroupByFIO()){
			System.out.println(student);
		}
		*/
	}
}