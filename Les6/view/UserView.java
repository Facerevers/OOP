package view;
import java.util.list;
import model.User;
public interface UserView<T extends User>{
	void sendOnConsole(List<T> list);
}