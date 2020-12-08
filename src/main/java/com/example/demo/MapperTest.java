package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Entity.Album;
import DTO.AlbumDTO;
import Mapper.AlbumMapper;

public class MapperTest {

	
@Test
public void AlbumTest() {
	Album album = new Album(0, null, null, 0, null, 0);
	Album.setAlbumName("Freudian");
	AlbumDTO AlbumDTO = AlbumMapper.AlbumToDTO(album);
	
	assertEquals(album.getAlbumName(),AlbumDTO.getAlbumName());


	}
}