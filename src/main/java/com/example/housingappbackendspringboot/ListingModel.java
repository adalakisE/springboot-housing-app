package com.example.housingappbackendspringboot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListingModel {
    @Id
    private ObjectId _id;
    private Integer id;
    private String imdbId;
    private String title;
    private String description;
    private Number price;
    private Number sqFt;
    private String area;
    private String photoLink;
    private Number bedrooms;
    private Number latitude;
    private Number longitude;
}
