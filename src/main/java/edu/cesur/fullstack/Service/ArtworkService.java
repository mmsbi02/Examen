package edu.cesur.fullstack.Service;

import java.util.ArrayList;

import edu.cesur.fullstack.model.ArtworkDTO;

public interface ArtworkService {
	
	ArrayList<ArtworkDTO> getAllArtworks();
	
	void createArtwork(ArtworkDTO artworkDTO);

}
