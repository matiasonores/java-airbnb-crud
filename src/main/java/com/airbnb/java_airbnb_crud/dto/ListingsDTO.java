package com.airbnb.java_airbnb_crud.dto;

import com.airbnb.java_airbnb_crud.model.Address;
import com.airbnb.java_airbnb_crud.model.Images;
import com.airbnb.java_airbnb_crud.model.Host;
import com.airbnb.java_airbnb_crud.model.ReviewScores;

import java.math.BigDecimal;
import java.util.List;

public class ListingsDTO {

    private String id;
    private String name;
    private String summary;
    private String propertyType;
    private String roomType;
    private int accommodates;
    private int bedrooms;
    private int beds;
    private int bathrooms;
    private BigDecimal price;
    private List<String> amenities;
    private Images images;
    private Address address;
    private Host host;
    private ReviewScores reviewScores;

    // Constructor
    public ListingsDTO(String id, String name, String summary, String propertyType, String roomType,
                      int accommodates, int bedrooms, int beds, int bathrooms, BigDecimal price,
                      List<String> amenities, Images images, Address address,
                      Host host, ReviewScores reviewScores) {
        this.id = id;
        this.name = name;
        this.summary = summary;
        this.propertyType = propertyType;
        this.roomType = roomType;
        this.accommodates = accommodates;
        this.bedrooms = bedrooms;
        this.beds = beds;
        this.bathrooms = bathrooms;
        this.price = price;
        this.amenities = amenities;
        this.images = images;
        this.address = address;
        this.host = host;
        this.reviewScores = reviewScores;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getAccommodates() {
		return accommodates;
	}

	public void setAccommodates(int accommodates) {
		this.accommodates = accommodates;
	}

	public int getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}

	public int getBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<String> getAmenities() {
		return amenities;
	}

	public void setAmenities(List<String> amenities) {
		this.amenities = amenities;
	}

	public Images getImages() {
		return images;
	}

	public void setImages(Images images) {
		this.images = images;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Host getHost() {
		return host;
	}

	public void setHost(Host host) {
		this.host = host;
	}

	public ReviewScores getReviewScores() {
		return reviewScores;
	}

	public void setReviewScores(ReviewScores reviewScores) {
		this.reviewScores = reviewScores;
	}
}
