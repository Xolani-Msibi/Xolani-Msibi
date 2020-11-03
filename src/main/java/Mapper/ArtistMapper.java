package com.example.demo;


import com.example.demo.Artist;
import com.example.demo.ArtistDTO;

@Mapper
public interface ArtistMapper{
	@Mapping(source = "name", target = "name")
	ArtistDTO artistToDTO(Artist artist);
	
}