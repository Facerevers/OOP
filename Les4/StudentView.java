import java.util.list;
public class StudentView implements UserView<Student>{
	@Override
	public void sendOnConsole(List<Student> list){
		for(Student i : list)
			System.out.println(i);
	}
}