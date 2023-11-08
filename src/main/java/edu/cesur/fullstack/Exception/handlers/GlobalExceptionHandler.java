package edu.cesur.fullstack.Exception.handlers;





import java.net.URI;
import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import edu.cesur.fullstack.Exception.Artworkcreationexception;



@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Artworkcreationexception.class)
    public ProblemDetail handleArtisreationException(Artworkcreationexception a) {

        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, a.getMessage());
        problemDetail.setTitle("Error el artista no es de elite");
        problemDetail.setType(URI.create("http://cesurformacion.com"));
        problemDetail.setProperty("errorCategory", "Artwork");
        problemDetail.setProperty("timeStamp", Instant.now());

        return problemDetail;
    }
}

