package Repository;



import org.springframework.data.repository.CrudRepository;

import com.example.demo.Album;
import com.example.demo.S;

import DTO.AlbumDTO;

import com.example.demo.Album;

import java.util.Optional;


public interface AlbumRepository extends CrudRepository<AlbumDTO, Long> {
	Optional<AlbumDTO> findByAlbumName(String albumname);

	static Entity.Album saveAll(Entity.Album album1) {
		return album1;
		// TODO Auto-generated method stub
		
	}

	Entity.Album save(Entity.Album album);

}