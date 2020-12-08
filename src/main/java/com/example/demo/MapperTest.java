package com.example.demo;

import org.junit.Test;

import Mapper.AlbumMapper;

public class MapperTest {

	
@Test
public void AlbumTest() {
	Album album = new Album();
	Album.setAlbumName("Freudian");
	AlbumDTO AlbumDTO = AlbumMapper.albumToDTO(album);
	
	assertEquals(album.getAlbumName(),AlbumDTO.getAlbumName());


	}
}