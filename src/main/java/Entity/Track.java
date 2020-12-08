package Entity;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Track {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Trackid;
	private String Trackname;
	private int length;
	
	
	public Track(long trackid, String trackname, double d) {
		super();
		Trackid = trackid;
		Trackname = trackname;
		this.length = (int) d;
	}
	public long getTrackid() {
		return Trackid;
	}
	public void setTrackid(long trackid) {
		Trackid = trackid;
	}
	public String getTrackname() {
		return Trackname;
	}
	public void setTrackname(String trackname) {
		Trackname = trackname;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "Track [Trackid=" + Trackid + ", Trackname=" + Trackname + ", length=" + length + "]";
	}
}
