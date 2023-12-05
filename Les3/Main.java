import java.util.ArrayList;
import java.util.List;
public class Main{
	public static void main(String[] args){
		StudiedGroup studiedGroup1 = new StudiedGroup(1, 15, "qqq");
		StudiedGroup studiedGroup2 = new StudiedGroup(4, 17, "aaa");
		StudiedGroup studiedGroup3 = new StudiedGroup(2, 21, "fff");
		StudiedGroup studiedGroup4 = new StudiedGroup(3, 15, "hhh");
		List<StudiedGroup> studiedGroupList = new ArrayList<>();
		Stream stream = new StudiedGroup(studiedGroupList);
		
	}
}