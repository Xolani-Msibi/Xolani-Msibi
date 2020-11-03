package Repository;



import org.springframework.data.repository.CrudRepository;

import com.example.demo.Album;
import com.example.demo.Album;

import java.util.Optional;


public interface AlbumRepository extends CrudRepository<Album, Long> {
	Optional<Album> findByAlbumName(String albumname);
}