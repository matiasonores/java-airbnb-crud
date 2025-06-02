package com.airbnb.java_airbnb_crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.airbnb.java_airbnb_crud.model.Listing;
import java.util.List;
import java.util.Optional;

public interface ListingRepository extends MongoRepository<Listing, String> {

}
