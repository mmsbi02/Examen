package edu.cesur.fullstack.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import edu.cesur.fullstack.Exception.Artistexception;
import edu.cesur.fullstack.model.ArtistDTO;
import edu.cesur.fullstack.model.ArtworkDTO;

@Service
public class ArtworkServiceImpl implements ArtworkService{
	
	ArrayList<ArtworkDTO> artwork = new ArrayList<>();

	ArtworkDTO ar = new ArtworkDTO();

	ArtworkDTO ar2 = new ArtworkDTO();

	ArtworkDTO ar3 = new ArtworkDTO();

	ArtworkDTO ar4 = new ArtworkDTO();

	public ArtworkServiceImpl() {

		artwork.add(ar);
		
		artwork.add(ar2);
		
		artwork.add(ar3);
		
		artwork.add(ar4);

	}
	

	@Override
	public ArrayList<ArtworkDTO> getAllArtworks() {
		// TODO Auto-generated method stub
		return artwork;
	}

	@Override
	public void createArtwork(ArtworkDTO artworkDTO) {
		
        ArtistDTO a;
        a = a.getArtistById(artwork.getid());
    if(artwork.getid() == a.getId()) {
    	artwork.addAll(artwork);
    }
    else {
        throw new Artistexception("El artista no puede");


}
		
		
	
}
}