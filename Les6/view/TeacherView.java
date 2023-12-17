package view;
import java.util.list;
import model.Teacher;
public class TeacherView implements UserView<Teacher>{
	@Override
	public void sendOnConsole(List<Teacher> list){
		for(Teacher i : list)
			System.out.println(i);
	}
}