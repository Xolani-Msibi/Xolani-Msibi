package com.example.demo;

import com.example.demo.Genre;
import com.example.demo.GenreDTO;

@Mapper
public interface GenreMapper {

	@Mapping(source = "genre", target = "genre")
	GenreDTO genreToDTO(Genre genre);
}
