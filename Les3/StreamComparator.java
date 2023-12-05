public class StreamComparator implements Comparator<StudiedGroup>{
	@Override
	public int compare(StudiedGroup o1, StudiedGroup o2){
		if(o1.getGroupCounts() > o2.getGroupCounts()) return 1;
		else if(o1.getGroupCounts() < o2.getGroupCounts()) return -1;
		else return 0;
	}
}