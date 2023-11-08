package edu.cesur.fullstack.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArtworkDTO {
	
	

	Integer id;

	String title;
	String description;

	Integer artistId;
	
	
	 public Integer getid() {
	        return id;
	    }
	    public void setid(Integer id) {
	        this.id = id;
	    }
	    public String gettitle() {
	        return title;
	    }
	    public void settitle(String title) {
	        this.title = title;
	    }
	    public String getdescription() {
	        return description;
	    }
	    public void setdescription(String description) {
	        this.description = description;
	    }
	    public Integer getartistId() {
	        return artistId;
	    }
	    public void setartistId(Integer artistId) {
	        this.artistId = artistId;
	    }
	    public ArtworkDTO(Integer id, String title, String description, Integer artistId) {
	        super();
	        this.id = id;
	        this.title = title;
	        this.description = description;
	        this.artistId = artistId;
	    }
	    public ArtworkDTO() {
	        super();
	    }

}
