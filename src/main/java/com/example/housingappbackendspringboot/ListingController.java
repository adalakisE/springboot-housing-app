package com.example.housingappbackendspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/search")
    public ResponseEntity<List<ListingModel>> searchListingsByQuery(
            @RequestParam(name = "title", required = false) String title,
            @RequestParam(name = "price", required = false) Integer price,
            @RequestParam(name = "bedrooms", required = false) Integer bedrooms
    ) {
        QueryObject query = new QueryObject();
        query.setTitle(title);
        query.setPrice(price);
        query.setBedrooms(bedrooms);

        List<ListingModel> searchResults = service.searchListingsByQuery(query);
        return new ResponseEntity<>(searchResults, HttpStatus.OK);
    }
}



//    @GetMapping("/search")
//    public ResponseEntity<List<ListingModel>> searchListingsByQuery(
//            @RequestParam(name = "location", required = false) String location,
//            @RequestParam(name = "minPrice", required = false) Integer minPrice,
//            @RequestParam(name = "maxPrice", required = false) Integer maxPrice,
//            @RequestParam(name = "minBedrooms", required = false) Integer minBedrooms,
//            @RequestParam(name = "minBathrooms", required = false) Integer minBathrooms
//    ) {
//        QueryObject query = new QueryObject();
//        query.setLocation(location);
//        query.setMinPrice(minPrice);
//        query.setMaxPrice(maxPrice);
//        query.setMinBedrooms(minBedrooms);
//        query.setMinBathrooms(minBathrooms);
//
//        List<ListingModel> searchResults = service.searchListingsByQuery(query);
//        return new ResponseEntity<>(searchResults, HttpStatus.OK);
//    }
