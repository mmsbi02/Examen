package edu.cesur.fullstack.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArtistDTO {
	

	Integer id;

	String name;
	  public Integer getId() {
	        return id;
	    }
	    public void setid(Integer id) {
	        this.id = id;
	    }
	    public String getname() {
	        return name;
	    }
	    public void setname(String name) {
	    	this.name = name;
	    }
	    public ArtistDTO (Integer id, String name) {
	        super();
	        this.id = id;
	        this.name = name;
	    }
	    public ArtistDTO () {
	        super();
	    }
	
	
	

}
