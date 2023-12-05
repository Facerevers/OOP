import java.util.List;
public class StreamService{
	public void sortStream(List<StudiedGroup> studiedGroupList){
		studiedGroupList.sort(new StreamComparator());
	}
}