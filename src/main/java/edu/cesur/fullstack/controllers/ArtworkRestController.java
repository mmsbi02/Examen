package edu.cesur.fullstack.controllers;
import java.net.URI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.cesur.fullstack.model. ArtworkDTO ;
import edu.cesur.fullstack.Service. ArtworkService;

@RestController
@RequestMapping("/artworks")
public class ArtworkRestController {
	
	@Autowired
	ArtworkService ArtworkService;
	
	@PostMapping()
	public ResponseEntity<?> createArtwork(@RequestBody @Validated  ArtworkDTO id){
		
		ArtworkService.createArtwork(id);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(id.getid())
				.toUri();
		
		return ResponseEntity.created(location).build();		
		
	}
	
	@GetMapping()
	public ResponseEntity<?> getAllBooks(){
		return ResponseEntity.ok(ArtworkService.getAllArtworks());
	}

}
