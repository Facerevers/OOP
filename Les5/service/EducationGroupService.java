package service;
public class EducationGroupService{
	public EducationGroup createEducationGroup(Teacher teacher, List<Student> studentList){
		return new EducationGroup(teacher, studentList);
	}
}