package com.airbnb.java_airbnb_crud.controller;

import com.airbnb.java_airbnb_crud.dto.ListingsDTO;
import com.airbnb.java_airbnb_crud.model.Listings;
import com.airbnb.java_airbnb_crud.model.Review;
import com.airbnb.java_airbnb_crud.service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/listings")
public class ListingController {

    @Autowired
    private ListingService listingService;

    // === CRUD de Listings ===

    /*
    @GetMapping
    public ResponseEntity<List<Listings>> getAllListings() {
        List<Listings> listings = listingService.getAllListings();
        return ResponseEntity.ok(listings);
    }
	*/
    @GetMapping
    public ResponseEntity<List<ListingsDTO>> getAllListings() {
        List<Listings> listings = listingService.getAllListings();

        List<ListingsDTO> dtoList = listings.stream()
            .map(listing -> new ListingsDTO(
                listing.get_id(),
                listing.getName(),
                listing.getSummary(),
                listing.getProperty_type(),
                listing.getRoom_type(),
                listing.getAccommodates(),
                listing.getBedrooms(),
                listing.getBeds(),
                listing.getBathrooms(),
                listing.getPrice(),
                listing.getAmenities(),
                listing.getImages(),
                listing.getAddress(),
                listing.getHost(),
                listing.getReview_scores()
            ))
            .collect(Collectors.toList());

        return ResponseEntity.ok(dtoList);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Listings> getListingById(@PathVariable String id) {
        Listings listing = listingService.getListingById(id);

        if (listing == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(listing);
    }

    @PostMapping
    public ResponseEntity<Listings> createListing(@RequestBody Listings listing) {
        Listings createdListing = listingService.saveListing(listing);
        return ResponseEntity.ok(createdListing);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Listings> updateListing(@PathVariable String id, @RequestBody Listings updatedData) {
        Listings updatedListing = listingService.updateListing(id, updatedData);

        if (updatedListing == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(updatedListing);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteListing(@PathVariable String id) {
        Listings existing = listingService.getListingById(id);

        if (existing == null) {
            return ResponseEntity.notFound().build();
        }

        listingService.deleteListing(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public ResponseEntity<List<Listings>> searchListingsByName(@RequestParam String name) {
        List<Listings> matchingListings = listingService.findByName(name);
        return ResponseEntity.ok(matchingListings);
    }

    // === CRUD de Reviews ===

    @GetMapping("/{listingId}/reviews")
    public ResponseEntity<List<Review>> getAllReviewsForListing(@PathVariable String listingId) {
        List<Review> reviews = listingService.getAllReviews(listingId);
        return ResponseEntity.ok(reviews);
    }

    @GetMapping("/{listingId}/reviews/{reviewId}")
    public ResponseEntity<Review> getReviewById(@PathVariable String listingId, @PathVariable String reviewId) {
        Review review = listingService.getReviewById(listingId, reviewId);

        if (review == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(review);
    }

    @PostMapping("/{listingId}/reviews")
    public ResponseEntity<Review> addReviewToListing(@PathVariable String listingId, @RequestBody Review review) {
        Review addedReview = listingService.addReviewToListing(listingId, review);
        return ResponseEntity.ok(addedReview);
    }

    @PutMapping("/{listingId}/reviews/{reviewId}")
    public ResponseEntity<Review> updateReview(
            @PathVariable String listingId,
            @PathVariable String reviewId,
            @RequestBody Review updatedReview
    ) {
        Review review = listingService.updateReview(listingId, reviewId, updatedReview);

        if (review == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(review);
    }

    @DeleteMapping("/{listingId}/reviews/{reviewId}")
    public ResponseEntity<Void> deleteReview(
            @PathVariable String listingId,
            @PathVariable String reviewId
    ) {
        boolean deleted = listingService.deleteReviewById(listingId, reviewId);

        if (!deleted) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.noContent().build();
    }
}
