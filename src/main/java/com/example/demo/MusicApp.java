package com.example.demo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;





@SpringBootApplication
public class MusicApp {
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
			albumRepository.save(album1);
			Track track1 = new Track (1, "freudian", 3.00);
			trackRepository.save(track1);
			Genre genre1 = new Genre (1, "R&B/Soul");
			genreRepository.save(genre1);
			
			

			// fetch all artist
			log.info("Artists found with findAll():");
			log.info("-------------------------------");
			for (Artist artist : repository.findAll()) {
				log.info(artist.toString());
			}
			log.info("");
			
			// fetch all Albums
			log.info("Albums found with findAll():");
			log.info("-------------------------------");
			for (Album album : albumRepository.findAll()) {
				log.info(album.toString());
						}
			log.info("");


			
		};
	}	
}
