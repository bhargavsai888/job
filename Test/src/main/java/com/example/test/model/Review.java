package com.example.test.model;


public class Review {

    private Long id;
    private String title;
    private String description;
    private double rating;
    private Company company;
    
    public Review() {
    }
    
    public Review(Long id, String title, String description, double rating, Company company) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.company = company;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
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
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }
    
}
