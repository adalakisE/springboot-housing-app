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
@RequestMapping("/feed/items")
public class ListingController {

    @Autowired
    private ListingService service;
    @GetMapping
    public ResponseEntity<List<ListingModel>> getAllListings(){
        return new ResponseEntity<List<ListingModel>>(service.allListings(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ListingModel>> getSingleMovie(@PathVariable Integer id){
        return new ResponseEntity<Optional<ListingModel>>(service.singleListing(id), HttpStatus.OK);
    }
}
