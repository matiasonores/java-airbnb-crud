package com.airbnb.java_airbnb_crud.controller;

import com.airbnb.java_airbnb_crud.model.Listings;
import com.airbnb.java_airbnb_crud.service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/listings")
public class ListingController {

    @Autowired
    private ListingService listingsService;

    // GET /api/listings  - Get all
    @GetMapping
    public List<Listings> getAllListings() {
        return listingsService.getAllListings();
    }

    // GET /api/listings/{id} - Get por id
    @GetMapping("/{id}")
    public ResponseEntity<Listings> getListingById(@PathVariable String id) {
        Optional<Listings> listing = listingsService.getListingById(id);
        return listing.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // POST /api/listings - Create new
    @PostMapping
    public Listings createListing(@RequestBody Listings listing) {
        return listingsService.saveListing(listing);
    }

    // PUT /api/listings/{id} - Update one
    @PutMapping("/{id}")
    public ResponseEntity<Listings> updateListing(@PathVariable String id, @RequestBody Listings listingDetails) {
        Optional<Listings> existingListing = listingsService.getListingById(id);
        if (existingListing.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Listings listing = existingListing.get();

        listing.setName(listingDetails.getName());
        listing.setSummary(listingDetails.getSummary());
        /*
         * TODO agregar los otros campos
         */


        Listings updatedListing = listingsService.saveListing(listing);
        return ResponseEntity.ok(updatedListing);
    }

    // DELETE /api/listings/{id} - Delete one
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteListing(@PathVariable String id) {
        listingsService.deleteListing(id);
        return ResponseEntity.noContent().build();
    }
}