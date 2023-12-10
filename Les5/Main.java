import controller.Controller;
import service.EducationGroupService;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Controller controller = new Controller();
		controller.createStudent("qwe", "qwe", "qwe");
		controller.createStudent("qwe1", "qwe1", "qwe1");
		controller.createStudent("qwe2", "qwe2", "qwe2");
		controller.getAllStudent();
		EducationGroupService educationGroupservice = new EducationGroupservice();
		Controller controller = new Controller(educationGroupservice);
		List<Student> studentList = Arrays.asList(1, 2, 3);
		EducationGroup educationGroup = controller.createEducationGroup(15, studentList);
	}
}