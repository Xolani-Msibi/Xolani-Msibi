package DTO;

public class ArtistDTO {
	private String Name;
	private String Bio;
	
	
	@Override
	public String toString() {
		return "ArtistDTO [Name=" + Name + ", Bio=" + Bio + "]";
	}


	public String getName() {
		return Name;
	}
}
