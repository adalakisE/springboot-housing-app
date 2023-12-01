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
    private String title;
    private String description;
    private int price;
    private int sqFt;
    private String area;
    private String photoLink;
    private int bedrooms;
    private int latitude;
    private int longitude;

    public ListingModel(){

    }

    public ListingModel(ObjectId _id,
                        Integer id,
                        String title,
                        String description,
                        int price,
                        int sqFt,
                        String area,
                        String photoLink,
                        int bedrooms,
                        int latitude,
                        int longitude) {
        this._id = _id;
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.sqFt = sqFt;
        this.area = area;
        this.photoLink = photoLink;
        this.bedrooms = bedrooms;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public ListingModel(Integer id, String title, String description, int price, int sqFt, String area, String photoLink, int bedrooms, int latitude, int longitude) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.sqFt = sqFt;
        this.area = area;
        this.photoLink = photoLink;
        this.bedrooms = bedrooms;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSqFt() {
        return sqFt;
    }

    public void setSqFt(int sqFt) {
        this.sqFt = sqFt;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "ListingModel{" +
                "_id=" + _id +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", sqFt=" + sqFt +
                ", area='" + area + '\'' +
                ", photoLink='" + photoLink + '\'' +
                ", bedrooms=" + bedrooms +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
