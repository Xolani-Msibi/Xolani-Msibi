package com.example.demo;



import com.example.demo.Album;
import com.example.demo.AlbumDTO;


@Mapper
public interface AlbumMapper{
	
	@Mapping(source = "year", target = "year")
	
	AlbumDTO albumToDTO(Album album);
	
}