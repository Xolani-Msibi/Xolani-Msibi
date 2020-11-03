package com.example.demo;


@Mapper
public interface TrackMapper {
	@Mapping(source = "trakename", target = "trackname")
	TrackDTO trackToDTO(Track track);
}
