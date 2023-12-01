package com.example.housingappbackendspringboot;

public class QueryObject {
    private String title;
    private int price;
    private int bedrooms;

    // Constructors, getters, and setters

    public QueryObject() {
        // Default constructor
    }

    public QueryObject(String title, int price, int bedrooms) {
        this.title = title;
        this.price = price;
        this.bedrooms = bedrooms;


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

}
