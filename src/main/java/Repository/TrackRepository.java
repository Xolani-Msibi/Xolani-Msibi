package Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Track;



public interface TrackRepository extends CrudRepository<Track, Long> {

}
