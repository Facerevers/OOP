public class StudiedGroup{
	private int streamId;
	private int groupCounts;
	private String name;
	public StudiedGroup(int streamId, int groupCounts, String name){
		this.streamId = streamId;
		this.groupCounts = groupCounts;
		this.name = name;
	}
	public int getStreamId(){
		return streamId;
	}
	public void setStreamId(int streamId){
		this.streamId = streamId;
	}
	public int getGroupCounts(){
		return groupCounts;
	}
	public void setGroupCounts(int groupCounts){
		this.groupCounts = groupCounts;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	@Override
	public String toString(){
		return "Stream{" + "streamId=" + streamId + ", groupCounts=" + groupCounts + ", name=" + name + '}';
	}
}