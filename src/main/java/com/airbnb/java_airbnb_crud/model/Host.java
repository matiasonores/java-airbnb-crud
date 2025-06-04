package com.airbnb.java_airbnb_crud.model;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Host{
    @JsonProperty("host_id") 
    public String getHost_id() { 
		 return this.host_id; } 
    public void setHost_id(String host_id) { 
		 this.host_id = host_id; } 
    String host_id;
    @JsonProperty("host_url") 
    public String getHost_url() { 
		 return this.host_url; } 
    public void setHost_url(String host_url) { 
		 this.host_url = host_url; } 
    String host_url;
    @JsonProperty("host_name") 
    public String getHost_name() { 
		 return this.host_name; } 
    public void setHost_name(String host_name) { 
		 this.host_name = host_name; } 
    String host_name;
    @JsonProperty("host_location") 
    public String getHost_location() { 
		 return this.host_location; } 
    public void setHost_location(String host_location) { 
		 this.host_location = host_location; } 
    String host_location;
    @JsonProperty("host_about") 
    public String getHost_about() { 
		 return this.host_about; } 
    public void setHost_about(String host_about) { 
		 this.host_about = host_about; } 
    String host_about;
    @JsonProperty("host_response_time") 
    public String getHost_response_time() { 
		 return this.host_response_time; } 
    public void setHost_response_time(String host_response_time) { 
		 this.host_response_time = host_response_time; } 
    String host_response_time;
    @JsonProperty("host_thumbnail_url") 
    public String getHost_thumbnail_url() { 
		 return this.host_thumbnail_url; } 
    public void setHost_thumbnail_url(String host_thumbnail_url) { 
		 this.host_thumbnail_url = host_thumbnail_url; } 
    String host_thumbnail_url;
    @JsonProperty("host_picture_url") 
    public String getHost_picture_url() { 
		 return this.host_picture_url; } 
    public void setHost_picture_url(String host_picture_url) { 
		 this.host_picture_url = host_picture_url; } 
    String host_picture_url;
    @JsonProperty("host_neighbourhood") 
    public String getHost_neighbourhood() { 
		 return this.host_neighbourhood; } 
    public void setHost_neighbourhood(String host_neighbourhood) { 
		 this.host_neighbourhood = host_neighbourhood; } 
    String host_neighbourhood;
    @JsonProperty("host_response_rate") 
    public int getHost_response_rate() { 
		 return this.host_response_rate; } 
    public void setHost_response_rate(int host_response_rate) { 
		 this.host_response_rate = host_response_rate; } 
    int host_response_rate;
    @JsonProperty("host_is_superhost") 
    public boolean getHost_is_superhost() { 
		 return this.host_is_superhost; } 
    public void setHost_is_superhost(boolean host_is_superhost) { 
		 this.host_is_superhost = host_is_superhost; } 
    boolean host_is_superhost;
    @JsonProperty("host_has_profile_pic") 
    public boolean getHost_has_profile_pic() { 
		 return this.host_has_profile_pic; } 
    public void setHost_has_profile_pic(boolean host_has_profile_pic) { 
		 this.host_has_profile_pic = host_has_profile_pic; } 
    boolean host_has_profile_pic;
    @JsonProperty("host_identity_verified") 
    public boolean getHost_identity_verified() { 
		 return this.host_identity_verified; } 
    public void setHost_identity_verified(boolean host_identity_verified) { 
		 this.host_identity_verified = host_identity_verified; } 
    boolean host_identity_verified;
    @JsonProperty("host_listings_count") 
    public int getHost_listings_count() { 
		 return this.host_listings_count; } 
    public void setHost_listings_count(int host_listings_count) { 
		 this.host_listings_count = host_listings_count; } 
    int host_listings_count;
    @JsonProperty("host_total_listings_count") 
    public int getHost_total_listings_count() { 
		 return this.host_total_listings_count; } 
    public void setHost_total_listings_count(int host_total_listings_count) { 
		 this.host_total_listings_count = host_total_listings_count; } 
    int host_total_listings_count;
    @JsonProperty("host_verifications") 
    public ArrayList<String> getHost_verifications() { 
		 return this.host_verifications; } 
    public void setHost_verifications(ArrayList<String> host_verifications) { 
		 this.host_verifications = host_verifications; } 
    ArrayList<String> host_verifications;
}
