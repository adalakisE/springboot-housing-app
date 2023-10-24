package com.example.housingappbackendspringboot;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ListingRepository extends MongoRepository<ListingModel, ObjectId> {
    Optional<ListingModel> findMovieByImdbId(String imdbId);
}
