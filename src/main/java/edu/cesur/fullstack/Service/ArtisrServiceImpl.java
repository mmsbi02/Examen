package edu.cesur.fullstack.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import edu.cesur.fullstack.model.ArtistDTO;

@Service
public class ArtisrServiceImpl implements ArtistService{
	
	
	ArrayList<ArtistDTO> artist = new ArrayList<>();

	ArtistDTO ar = new ArtistDTO();

	ArtistDTO ar2 = new ArtistDTO();

	ArtistDTO ar3 = new ArtistDTO();

	ArtistDTO ar4 = new ArtistDTO();

	public  ArtisrServiceImpl() {

		artist.add(ar);
	
		artist.add(ar2);
	
		artist.add(ar3);
	
		artist.add(ar4);

	}
	
	

	@Override
	public ArtistDTO getArtistById(Integer id) {
		for (ArtistDTO  art :  artist ) {
            return art;
        }
        return null;
    }
	
	
	
	

}
