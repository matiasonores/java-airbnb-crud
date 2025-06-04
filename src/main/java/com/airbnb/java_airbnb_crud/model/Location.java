package com.airbnb.java_airbnb_crud.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location{
    @JsonProperty("type") 
    public String getType() { 
		 return this.type; } 
    public void setType(String type) { 
		 this.type = type; } 
    String type;
    @JsonProperty("coordinates") 
    public ArrayList<Double> getCoordinates() { 
		 return this.coordinates; } 
    public void setCoordinates(ArrayList<Double> coordinates) { 
		 this.coordinates = coordinates; } 
    ArrayList<Double> coordinates;
    @JsonProperty("is_location_exact") 
    public boolean getIs_location_exact() { 
		 return this.is_location_exact; } 
    public void setIs_location_exact(boolean is_location_exact) { 
		 this.is_location_exact = is_location_exact; } 
    boolean is_location_exact;
}
