package controller;
import model.Type;
import model.User;
import service.DataService;
import service.EducationGroupService;
import view.StudentView;
public class Controller{
	private final DataService dataService = new DataService();
	private final StudentVies studentView = new StudentView();
	public void createStudent(String firstName, String secondName, String lastName){
		dataService.create(firstName, secondName, lastName, Type.STUDENT);
	}
	public void getAllStudent(){
		for(User user : dataService.getAllConcUser(Type.STUDENT)){
			studentView.printOnConsole((Student) user);
		}
	}
	private EducationGroupService educationGroupService;
	public Controller(EducationGroupService educationGroupService){
		this.educationGroupService = educationGroupService;
	}
	public EducationGroup createEducationGroup(Teacher teacher, List<Student> studentList){
		Teacher teacher = getTeacher(getTeacherId());
		List<Student> studentList = getStudentList(getStudentId());
		return EducationGroupService.createEducationGroup(teacher, studentList);
	}
}