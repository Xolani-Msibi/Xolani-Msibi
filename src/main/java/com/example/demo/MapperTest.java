package com.example.demo;

import org.junit.Test;

public class MapperTest {

	
@Test
public void AlbumTest() {
	Album album = new Album();
	Album.setAlbumName("Culture");
	AlbumDTO AlbumDTO = AlbumMapper.AlbumToDTO(album);
	
	assertEquals(album.getAlbumName(),AlbumDTO.getAlbumName());


	}
}