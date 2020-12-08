package Mapper;



import org.springframework.web.bind.annotation.Mapping;

import com.example.demo.Album;
import com.example.demo.AlbumDTO;


@Mapper
public interface AlbumMapper<Album>{
	
	@Mapping(source = "year", target = "year")
	
	AlbumDTO albumToDTO(Album album);

	static DTO.AlbumDTO AlbumToDTO(Entity.Album album) {
		// TODO Auto-generated method stub
		return null;
	}
	
}