package com.example.housingappbackendspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class ListingController {

    @Autowired
    private ListingService service;
    @GetMapping
    public ResponseEntity<List<ListingModel>> getAllMovies(){
        return new ResponseEntity<List<ListingModel>>(service.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<ListingModel>> getSingleMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<ListingModel>>(service.singleMovie(imdbId), HttpStatus.OK);
    }
}
