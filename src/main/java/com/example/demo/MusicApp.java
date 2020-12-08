package com.example.demo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import DTO.AlbumDTO;
import Entity.Album;
import Entity.Artist;
import Entity.Genre;
import Entity.Track;
import Repository.AlbumRepository;
import Repository.ArtistRepository;
import Repository.GenreRepository;
import Repository.TrackRepository;





@SpringBootApplication
public class MusicApp<genreRepository> {
	private static final Logger log = LoggerFactory.getLogger(MusicApp.class);
	
	 public static void main(String[] args) {
		    SpringApplication.run(MusicApp.class);
		    
		  }
	 
	
	@Bean
	public CommandLineRunner demo(ArtistRepository repository, AlbumRepository albumRepository,TrackRepository trackRepository, 
			GenreRepository genreRepository) {
		return (args) -> {
			
			Artist artist1 = new Artist(1, "Daniel Ceasar", "Singer and Songwriter");
			repository.save(artist1);
			Album album1 = new Album (1, "Daniel Ceasar", "Singer and Songwriter", 1, "freudian", 2019);
			AlbumRepository.saveAll(album1);
			Track track1 = new Track (1, "freudian", 3.00);
			TrackRepository.saveAll(track1);
			Genre genre1 = new Genre (1, "R&B/Soul");
			genreRepository.saveAll(genre1);
			
			

			// fetch all artist
			log.info("Artists found with findAll():");
			log.info("-------------------------------");
			for (Repository.Artist artist : repository.findAll()) {
				log.info(artist.toString());
			}
			log.info("");
			
			// fetch all Albums
			log.info("Albums found with findAll():");
			log.info("-------------------------------");
			for (AlbumDTO album : albumRepository.findAll()) {
				log.info(album.toString());
						}
			log.info("");


			
		};
	}	
}
