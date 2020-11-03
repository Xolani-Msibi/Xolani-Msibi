package com.example.demo;

public class GenreDTO {
	private String Genre;

	@Override
	public String toString() {
		return "GenreDTO [Genre=" + Genre + "]";
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}
	
	

}

