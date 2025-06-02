package com.airbnb.java_airbnb_crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.airbnb.java_airbnb_crud.model.Listing;
import java.util.List;
import java.util.Optional;

public interface ListingRepository extends MongoRepository<Listing, String> {
    
    // Para buscar un listing por su id
    Optional<Listing> findById(String id);

    // Para buscar todos los listings
    List<Listing> findAll();

    // Create o Update de un listing
    <S extends Listing> S save(S listing);

    // Para hacer el delete de un listing
    void deleteById(String id);

    // Para validar que exista un listing segun su id
    boolean existsById(String id);

    // Para buscar listings por nombre
    List<Listing> findByNameContainingIgnoreCase(String name);

}
