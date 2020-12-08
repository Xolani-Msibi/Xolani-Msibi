package Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Genre;
import com.example.demo.GenreDTO;



public interface GenreRepository extends CrudRepository<GenreDTO, Long> {
	Optional<GenreDTO> findByGenreid(int genreid);

	void saveAll(Entity.Genre genre1);


}
