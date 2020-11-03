package com.example.demo;

public class TrackDTO {

	private String Trackname;
	private int length;
	
	@Override
	public String toString() {
		return "TrackDTO [Trackname=" + Trackname + ", length=" + length + "]";
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
}