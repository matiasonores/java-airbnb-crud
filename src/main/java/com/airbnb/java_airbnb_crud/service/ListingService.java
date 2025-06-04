package com.airbnb.java_airbnb_crud.service;

import com.airbnb.java_airbnb_crud.model.Listings;
import com.airbnb.java_airbnb_crud.model.Review;
import com.airbnb.java_airbnb_crud.repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListingService {

    @Autowired
    private ListingRepository listingRepository;

    // Obtener todos los listings
    public List<Listings> getAllListings() {
        List<Listings> allListings = listingRepository.findAll();
        return allListings;
    }

    // Obtener un listing por su ID
    public Listings getListingById(String id) {
        Listings listing = listingRepository.findById(id).orElse(null);
        return listing;
    }

    // Crear o guardar un nuevo listing
    public Listings saveListing(Listings listing) {
        Listings savedListing = listingRepository.save(listing);
        return savedListing;
    }

    // Eliminar un listing por su ID
    public void deleteListing(String id) {
        listingRepository.deleteById(id);
    }

    // Buscar listings por nombre
    public List<Listings> findByName(String name) {
        List<Listings> matchingListings = listingRepository.findByName(name);
        return matchingListings;
    }

    // Actualizar un listing existente por su ID
    public Listings updateListing(String listingId, Listings updatedData) {
        Listings existingListing = listingRepository.findById(listingId).orElse(null);

        if (existingListing == null) {
        	throw new RuntimeException("No se encontró una listing con ID: " + listingId);
        }
        
        existingListing.setName(updatedData.getName());
        existingListing.setAddress(updatedData.getAddress());
        existingListing.setDescription(updatedData.getDescription());
        existingListing.setPrice(updatedData.getPrice());

        Listings updatedListing = listingRepository.save(existingListing);
        return updatedListing;
    }

    public List<Review> getAllReviews(String listingId) {
        Listings listing = listingRepository.findById(listingId).orElse(null);

        if (listing == null) {
            throw new RuntimeException("No se encontró una listing con ID: " + listingId);
        }

        List<Review> reviewsOfListing = listing.getReviews();

        if (reviewsOfListing == null) {
            return new ArrayList<>();
        }

        return reviewsOfListing;
    }

    public Review getReviewById(String listingId, String reviewId) {
        Listings listing = listingRepository.findById(listingId).orElse(null);

        if (listing == null) {
            throw new RuntimeException("No se encontró una listing con ID: " + listingId);
        }

        List<Review> reviewsOfListing = listing.getReviews();

        if (reviewsOfListing == null) {
            return null;
        }

        for (Review review : reviewsOfListing) {
            String currentReviewId = review.get_id();

            if (currentReviewId != null && currentReviewId.equals(reviewId)) {
                return review;
            }
        }

        return null;
    }

    public Review addReviewToListing(String listingId, Review newReview) {
        Listings listing = listingRepository.findById(listingId).orElse(null);

        if (listing == null) {
            throw new RuntimeException("No se encontró una listing con ID: " + listingId);
        }

        List<Review> reviews = listing.getReviews();

        if (reviews == null) {
            reviews = new ArrayList<>();
        }

        reviews.add(newReview);
        listing.setReviews(reviews);

        listingRepository.save(listing);

        return newReview;
    }

    public Review updateReview(String listingId, String reviewId, Review updatedReview) {
        Listings listing = listingRepository.findById(listingId).orElse(null);

        if (listing == null) {
            throw new RuntimeException("No se encontró una listing con ID: " + listingId);
        }

        List<Review> reviews = listing.getReviews();

        if (reviews == null) {
            throw new RuntimeException("La listing no contiene reviews.");
        }

        boolean updated = false;

        for (int i = 0; i < reviews.size(); i++) {
            if (reviews.get(i).get_id().equals(reviewId)) {
                reviews.set(i, updatedReview);
                updated = true;
                break;
            }
        }

        if (!updated) {
            throw new RuntimeException("No se encontró una review con ID: " + reviewId + " para actualizar.");
        }

        listing.setReviews(reviews);
        listingRepository.save(listing);

        return updatedReview;
    }

    public boolean deleteReviewById(String listingId, String reviewId) {
        Listings listing = listingRepository.findById(listingId).orElse(null);

        if (listing == null) {
            throw new RuntimeException("No se encontró una listing con ID: " + listingId);
        }

        List<Review> reviews = listing.getReviews();

        if (reviews == null) {
            return false;
        }

        Review reviewToRemove = null;

        for (Review review : reviews) {
            if (review.get_id().equals(reviewId)) {
                reviewToRemove = review;
                break;
            }
        }

        if (reviewToRemove == null) {
            return false;
        }

        reviews.remove(reviewToRemove);
        listing.setReviews(reviews);
        listingRepository.save(listing);

        return true;
    }

}
