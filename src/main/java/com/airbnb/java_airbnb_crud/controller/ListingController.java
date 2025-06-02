package com.airbnb.java_airbnb_crud.controller;

import com.airbnb.java_airbnb_crud.model.Listing;
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
    private ListingService listingService;

    // GET /api/listings  - Get all
    @GetMapping
    public List<Listing> getAllListings() {
        return listingService.getAllListings();
    }

    // GET /api/listings/{id} - Get por id
    @GetMapping("/{id}")
    public ResponseEntity<Listing> getListingById(@PathVariable String id) {
        Optional<Listing> listing = listingService.getListingById(id);
        return listing.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // POST /api/listings - Create new
    @PostMapping
    public Listing createListing(@RequestBody Listing listing) {
        return listingService.saveListing(listing);
    }

    // PUT /api/listings/{id} - Update one
    @PutMapping("/{id}")
    public ResponseEntity<Listing> updateListing(@PathVariable String id, @RequestBody Listing listingDetails) {
        Optional<Listing> existingListing = listingService.getListingById(id);
        if (existingListing.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Listing listing = existingListing.get();

        listing.setName(listingDetails.getName());
        listing.setSummary(listingDetails.getSummary());
        /*
         * TODO agregar los otros campos
         */


        Listing updatedListing = listingService.saveListing(listing);
        return ResponseEntity.ok(updatedListing);
    }

    // DELETE /api/listings/{id} - Delete one
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteListing(@PathVariable String id) {
        listingService.deleteListing(id);
        return ResponseEntity.noContent().build();
    }
}