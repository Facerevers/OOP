public class TeacherControler implements UserControler<Teacher>{
	private final TeacherService teacherService = new TeacherService();
	private final TeacherView teacherView = new TeacherView();
	@Override
	public void create(String firstName, String secondName, String lastName){
		teacherService.create(firstName, secondName, lastName);
	}
	@Override
	public void sendOnConsole(){
		teacherView.sendOnConsole(teacherService.getTeacherList());
	}
	public void edit(int teacherId,String firstName, String secondName, String lastName){
		for(Teacher teacher : teacherList){
			if(teacherId == teachetList.getTeacherId()){
				this.firstName = firstName;
				this.secondName = secondName;
				this.lastName = lastName;
			}
		}
	}
}