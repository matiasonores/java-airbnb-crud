package com.airbnb.java_airbnb_crud.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

@Document(collection = "listingsAndReviews")
public class Listings {

    String _id;
    String listing_url;
    String name;
    String summary;
    String space;
    String description;
    String neighborhood_overview;
    String notes;
    String transit;
    String access;
    String interaction;
    String house_rules;
    String property_type;
    String room_type;
    String bed_type;
    String minimum_nights;
    String maximum_nights;
    String cancellation_policy;
    Date last_scraped;
    Date calendar_last_scraped;
    Date first_review;
    Date last_review;
    int accommodates;
    int bedrooms;
    int beds;
    int number_of_reviews;
    int bathrooms;
    ArrayList<String> amenities;
    BigDecimal price;
    BigDecimal weekly_price;
    BigDecimal monthly_price;
    BigDecimal cleaning_fee;
    BigDecimal extra_people;
    BigDecimal guests_included;
    Images images;
    Host host;
    Address address;
    Availability availability;
    ReviewScores review_scores;
    ArrayList<Review> reviews;

    // === Getters y Setters ===
    @JsonProperty("_id")
    public String get_id() {
        return this._id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    @JsonProperty("listing_url")
    public String getListing_url() {
        return this.listing_url;
    }

    public void setListing_url(String listing_url) {
        this.listing_url = listing_url;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("space")
    public String getSpace() {
        return this.space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    @JsonProperty("description")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    /*
    @JsonProperty("neighborhood_overview")
    public String getNeighborhood_overview() {
        return this.neighborhood_overview;
    }

    public void setNeighborhood_overview(String neighborhood_overview) {
        this.neighborhood_overview = neighborhood_overview;
    }

    @JsonProperty("notes")
    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @JsonProperty("transit")
    public String getTransit() {
        return this.transit;
    }

    public void setTransit(String transit) {
        this.transit = transit;
    }

    @JsonProperty("access")
    public String getAccess() {
        return this.access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    @JsonProperty("interaction")
    public String getInteraction() {
        return this.interaction;
    }

    public void setInteraction(String interaction) {
        this.interaction = interaction;
    }

    @JsonProperty("house_rules")
    public String getHouse_rules() {
        return this.house_rules;
    }

    public void setHouse_rules(String house_rules) {
        this.house_rules = house_rules;
    }

    @JsonProperty("property_type")
    public String getProperty_type() {
        return this.property_type;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    @JsonProperty("room_type")
    public String getRoom_type() {
        return this.room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    @JsonProperty("bed_type")
    public String getBed_type() {
        return this.bed_type;
    }

    public void setBed_type(String bed_type) {
        this.bed_type = bed_type;
    }

    @JsonProperty("minimum_nights")
    public String getMinimum_nights() {
        return this.minimum_nights;
    }

    public void setMinimum_nights(String minimum_nights) {
        this.minimum_nights = minimum_nights;
    }

    @JsonProperty("maximum_nights")
    public String getMaximum_nights() {
        return this.maximum_nights;
    }

    public void setMaximum_nights(String maximum_nights) {
        this.maximum_nights = maximum_nights;
    }

    @JsonProperty("cancellation_policy")
    public String getCancellation_policy() {
        return this.cancellation_policy;
    }

    public void setCancellation_policy(String cancellation_policy) {
        this.cancellation_policy = cancellation_policy;
    }

    @JsonProperty("last_scraped")
    public Date getLast_scraped() {
        return this.last_scraped;
    }

    public void setLast_scraped(Date last_scraped) {
        this.last_scraped = last_scraped;
    }

    @JsonProperty("calendar_last_scraped")
    public Date getCalendar_last_scraped() {
        return this.calendar_last_scraped;
    }

    public void setCalendar_last_scraped(Date calendar_last_scraped) {
        this.calendar_last_scraped = calendar_last_scraped;
    }

    @JsonProperty("first_review")
    public Date getFirst_review() {
        return this.first_review;
    }

    public void setFirst_review(Date first_review) {
        this.first_review = first_review;
    }

    @JsonProperty("last_review")
    public Date getLast_review() {
        return this.last_review;
    }

    public void setLast_review(Date last_review) {
        this.last_review = last_review;
    }

    @JsonProperty("accommodates")
    public int getAccommodates() {
        return this.accommodates;
    }

    public void setAccommodates(int accommodates) {
        this.accommodates = accommodates;
    }

    @JsonProperty("bedrooms")
    public int getBedrooms() {
        return this.bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    @JsonProperty("beds")
    public int getBeds() {
        return this.beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    @JsonProperty("number_of_reviews")
    public int getNumber_of_reviews() {
        return this.number_of_reviews;
    }

    public void setNumber_of_reviews(int number_of_reviews) {
        this.number_of_reviews = number_of_reviews;
    }

    @JsonProperty("bathrooms")
    public int getBathrooms() {
        return this.bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    @JsonProperty("amenities")
    public ArrayList<String> getAmenities() {
        return this.amenities;
    }

    public void setAmenities(ArrayList<String> amenities) {
        this.amenities = amenities;
    }

    @JsonProperty("price")
    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @JsonProperty("weekly_price")
    public BigDecimal getWeekly_price() {
        return this.weekly_price;
    }

    public void setWeekly_price(BigDecimal weekly_price) {
        this.weekly_price = weekly_price;
    }

    @JsonProperty("monthly_price")
    public BigDecimal getMonthly_price() {
        return this.monthly_price;
    }

    public void setMonthly_price(BigDecimal monthly_price) {
        this.monthly_price = monthly_price;
    }

    @JsonProperty("cleaning_fee")
    public BigDecimal getCleaning_fee() {
        return this.cleaning_fee;
    }

    public void setCleaning_fee(BigDecimal cleaning_fee) {
        this.cleaning_fee = cleaning_fee;
    }

    @JsonProperty("extra_people")
    public BigDecimal getExtra_people() {
        return this.extra_people;
    }

    public void setExtra_people(BigDecimal extra_people) {
        this.extra_people = extra_people;
    }

    @JsonProperty("guests_included")
    public BigDecimal getGuests_included() {
        return this.guests_included;
    }

    public void setGuests_included(BigDecimal guests_included) {
        this.guests_included = guests_included;
    }

    @JsonProperty("images")
    public Images getImages() {
        return this.images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    @JsonProperty("host")
    public Host getHost() {
        return this.host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("availability")
    public Availability getAvailability() {
        return this.availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    @JsonProperty("review_scores")
    public ReviewScores getReview_scores() {
        return this.review_scores;
    }

    public void setReview_scores(ReviewScores review_scores) {
        this.review_scores = review_scores;
    }

    @JsonProperty("reviews")
    public ArrayList<Review> getReviews() {
        return this.reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }
    */
}
