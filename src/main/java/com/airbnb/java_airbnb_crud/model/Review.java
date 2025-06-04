package com.airbnb.java_airbnb_crud.model;

import org.springframework.data.annotation.Id;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Review {
    @Id
    private String _id;
    private String date;
    private String listing_id;
    private String reviewer_id;
    private String reviewer_name;
    private String comments;

    // Getters y Setters
    @JsonProperty("_id")
    public String get_id() { return _id; }
    public void set_id(String _id) { this._id = _id; }

    @JsonProperty("date")
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    @JsonProperty("listing_id")
    public String getListing_id() { return listing_id; }
    public void setListing_id(String listing_id) { this.listing_id = listing_id; }

    @JsonProperty("reviewer_id")
    public String getReviewer_id() { return reviewer_id; }
    public void setReviewer_id(String reviewer_id) { this.reviewer_id = reviewer_id; }

    @JsonProperty("reviewer_name")
    public String getReviewer_name() { return reviewer_name; }
    public void setReviewer_name(String reviewer_name) { this.reviewer_name = reviewer_name; }

    @JsonProperty("comments")
    public String getComments() { return comments; }
    public void setComments(String comments) { this.comments = comments; }
}
