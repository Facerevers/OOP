import java.util.List;
public class Stream implements Iterable<StudiedGroup>{
	private List<StudiedGroup> studiedGroupList;
	public Stream(List<StudiedGroup> studiedGroupList){
		this.studiedGroupList = studiedGroupList;
	}
	public List<StudiedGroup> getStudiedGroupList(){
		return studiedGroupList;
	}
	public void setStudiedGroupList(List<StudiedGroup> setStudiedGroupList){
		this.studiedGroupList = studiedGroupList;
	}
	public void addStudiedGroup(StudiedGroup studiedGroup){
		studiedGroupList.add(studiedGroup);
	}
	@Override
	public Iterator<StudiedGroup> iterator(){
		return new StudiedGroup(this);
	}
}