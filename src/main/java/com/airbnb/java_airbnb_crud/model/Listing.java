package com.airbnb.java_airbnb_crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "listingsAndReviews")
public class Listing {
    
    private String id;
    private String listingUrl;
    private String name;
    private String summary;
    private String space;
    private String description;
    private String neighborhoodOverview;
    private String notes;
    private String transit;
    private String access;
    private String interaction;
    private String houseRules;
    private String propertyType;
    private String roomType;
    private String bedType;

    private Integer minimumNights;
    private Integer maximumNights;
    private String cancellationPolicy;

    private LocalDateTime lastScraped;
    private LocalDateTime calendarLastScraped;

    private Integer accommodates;
    private Integer bedrooms;
    private Integer beds;
    private BigDecimal bathrooms;

    private List<String> amenities;

    private BigDecimal price;
    private BigDecimal weeklyPrice;
    private BigDecimal monthlyPrice;
    private BigDecimal cleaningFee;
    private BigDecimal extraPeople;
    private BigDecimal guestsIncluded;

    // Imagenes
    private String pictureUrl;
    private String thumbnailUrl;
    private String mediumUrl;
    private String xlPictureUrl;

    // Host
    private String hostId;
    private String hostUrl;
    private String hostName;
    private String hostLocation;
    private String hostAbout;
    private String hostThumbnailUrl;
    private String hostPictureUrl;
    private String hostNeighbourhood;
    private Boolean hostIsSuperhost;
    private Boolean hostHasProfilePic;
    private Boolean hostIdentityVerified;
    private Integer hostListingsCount;
    private Integer hostTotalListingsCount;
    private List<String> hostVerifications;

    // Dirección
    private String street;
    private String suburb;
    private String governmentArea;
    private String market;
    private String country;
    private String countryCode;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Boolean isLocationExact;

    // Disponibilidad
    private Integer availability30;
    private Integer availability60;
    private Integer availability90;
    private Integer availability365;

    // Reviews
    private Integer numberOfReviews;

    //Getters y Setters
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getSummary() 
	{
		return summary;
	}
	public void setSummary(String summary) 
	{
		this.summary = summary;
	}
}
