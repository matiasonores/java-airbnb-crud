package com.airbnb.java_airbnb_crud.model;
import com.fasterxml.jackson.annotation.JsonProperty;
public class Images{
    @JsonProperty("thumbnail_url") 
    public String getThumbnail_url() { 
		 return this.thumbnail_url; } 
    public void setThumbnail_url(String thumbnail_url) { 
		 this.thumbnail_url = thumbnail_url; } 
    String thumbnail_url;
    @JsonProperty("medium_url") 
    public String getMedium_url() { 
		 return this.medium_url; } 
    public void setMedium_url(String medium_url) { 
		 this.medium_url = medium_url; } 
    String medium_url;
    @JsonProperty("picture_url") 
    public String getPicture_url() { 
		 return this.picture_url; } 
    public void setPicture_url(String picture_url) { 
		 this.picture_url = picture_url; } 
    String picture_url;
    @JsonProperty("xl_picture_url") 
    public String getXl_picture_url() { 
		 return this.xl_picture_url; } 
    public void setXl_picture_url(String xl_picture_url) { 
		 this.xl_picture_url = xl_picture_url; } 
    String xl_picture_url;
}
