package Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genre {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Genreid;
	private String Genre;
	
	public Genre(long genreid, String genre) {
		super();
		Genreid = genreid;
		Genre = genre;
	}
	@Override
	public String toString() {
		return "Genre [Genreid=" + Genreid + ", Genre=" + Genre + "]";
	}
	public long getGenreid() {
		return Genreid;
	}
	public void setGenreid(long genreid) {
		Genreid = genreid;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	
	

}
