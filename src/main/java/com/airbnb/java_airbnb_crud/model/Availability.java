package com.airbnb.java_airbnb_crud.model;
import com.fasterxml.jackson.annotation.JsonProperty;
public class Availability{
    @JsonProperty("availability_30") 
    public int getAvailability_30() { 
		 return this.availability_30; } 
    public void setAvailability_30(int availability_30) { 
		 this.availability_30 = availability_30; } 
    int availability_30;
    @JsonProperty("availability_60") 
    public int getAvailability_60() { 
		 return this.availability_60; } 
    public void setAvailability_60(int availability_60) { 
		 this.availability_60 = availability_60; } 
    int availability_60;
    @JsonProperty("availability_90") 
    public int getAvailability_90() { 
		 return this.availability_90; } 
    public void setAvailability_90(int availability_90) { 
		 this.availability_90 = availability_90; } 
    int availability_90;
    @JsonProperty("availability_365") 
    public int getAvailability_365() { 
		 return this.availability_365; } 
    public void setAvailability_365(int availability_365) { 
		 this.availability_365 = availability_365; } 
    int availability_365;
}
