package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import DTO.AlbumDTO;
import Entity.Album;
import Repository.AlbumRepository;

@EnableJpaRepositories(basePackages = "repositories")
@RestController
@RequestMapping("/Album")
public class AlbumController {
	
	@Autowired
	private AlbumRepository albumRepository;

	@GetMapping()
	public Iterable<AlbumDTO> findAll() {
		return albumRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Album create(@RequestBody Album album) {
		return albumRepository.save(album);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		albumRepository.findById(id).orElseThrow(IllegalArgumentException::new);
		albumRepository.deleteById(id);
	}
	
	@PutMapping("/{AlbumName}")
	public Album updateAlbum(@RequestBody Album album, @PathVariable String albumname) {
		if (album.getAlbumName() != albumname) {
			throw new IllegalArgumentException();
		}
		albumRepository.findByAlbumName(albumname).orElseThrow(IllegalArgumentException::new);
		return albumRepository.save(album);


	}
	
}
