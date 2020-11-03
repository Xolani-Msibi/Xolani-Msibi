package Entity;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Album extends Artist {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Albumid;
	private String AlbumName;
	private int year;
	
	@OneToMany
	private List<Track> track;

	
	public Album(long iD, String name, String bio, long albumid, String albumName, int year) {
		super(iD, name, bio);
		Albumid = albumid;
		setAlbumName(albumName);
	}


	public String getAlbumName() {
		return AlbumName;
	}


	public void setAlbumName(String albumName) {
		AlbumName = albumName;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
}