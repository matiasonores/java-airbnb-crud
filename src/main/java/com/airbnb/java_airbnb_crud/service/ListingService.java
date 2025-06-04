package com.airbnb.java_airbnb_crud.service;

import com.airbnb.java_airbnb_crud.model.Listings;
import com.airbnb.java_airbnb_crud.repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListingService {

    @Autowired
    private ListingRepository listingRepository;

    public List<Listings> getAllListings() {
        return listingRepository.findAll();
    }
    
    public Optional<Listings> getListingById(String id) {
        return listingRepository.findById(id);
    }

    public Listings saveListing(Listings listing) {
        return listingRepository.save(listing);
    }

    public void deleteListing(String id) {
        listingRepository.deleteById(id);
    }
    
    public List<Listings> findByName(String name) {
        return listingRepository.findByNameContainingIgnoreCase(name);
    }
}