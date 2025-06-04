package com.airbnb.java_airbnb_crud.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address{
    @JsonProperty("street") 
    public String getStreet() { 
		 return this.street; } 
    public void setStreet(String street) { 
		 this.street = street; } 
    String street;
    @JsonProperty("suburb") 
    public String getSuburb() { 
		 return this.suburb; } 
    public void setSuburb(String suburb) { 
		 this.suburb = suburb; } 
    String suburb;
    @JsonProperty("government_area") 
    public String getGovernment_area() { 
		 return this.government_area; } 
    public void setGovernment_area(String government_area) { 
		 this.government_area = government_area; } 
    String government_area;
    @JsonProperty("market") 
    public String getMarket() { 
		 return this.market; } 
    public void setMarket(String market) { 
		 this.market = market; } 
    String market;
    @JsonProperty("country") 
    public String getCountry() { 
		 return this.country; } 
    public void setCountry(String country) { 
		 this.country = country; } 
    String country;
    @JsonProperty("country_code") 
    public String getCountry_code() { 
		 return this.country_code; } 
    public void setCountry_code(String country_code) { 
		 this.country_code = country_code; } 
    String country_code;
    @JsonProperty("location") 
    public Location getLocation() { 
		 return this.location; } 
    public void setLocation(Location location) { 
		 this.location = location; } 
    Location location;
}
