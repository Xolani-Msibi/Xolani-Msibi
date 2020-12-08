package Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Track;
import com.example.demo.TrackDTO;



public interface TrackRepository extends CrudRepository<TrackDTO, Long> {

	static void saveAll(Entity.Track track1) {
		// TODO Auto-generated method stub
		
	}

}
