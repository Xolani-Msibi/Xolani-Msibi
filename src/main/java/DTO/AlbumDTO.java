package DTO;

public class AlbumDTO {

	private String AlbumName;
	private int year;
	
	
	@Override
	public String toString() {
		return "AlbumDTO [AlbumName=" + AlbumName + ", year=" + year + "]";
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