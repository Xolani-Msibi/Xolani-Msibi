package Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Genre;



public interface GenreRepository extends CrudRepository<Genre, Long> {
	Optional<Genre> findByGenreid(int genreid);


}
