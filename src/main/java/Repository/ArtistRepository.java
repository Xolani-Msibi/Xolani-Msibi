package Repository;


import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Artist;



public interface ArtistRepository extends CrudRepository<Artist, Long> {
	Optional<Artist> findByName(String name);

	void save(Entity.Artist artist1);

	 


}
