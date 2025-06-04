package com.airbnb.java_airbnb_crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.airbnb.java_airbnb_crud.model.Listings;
import java.util.List;
import java.util.Optional;

public interface ListingRepository extends MongoRepository<Listings, String> {
    
    // Para buscar un listing por su id
    Optional<Listings> findById(String id);

    // Para buscar todos los listings
    List<Listings> findAll();

    // Create o Update de un listing
    <S extends Listings> S save(S listing);

    // Para hacer el delete de un listing
    void deleteById(String id);

    // Para validar que exista un listing segun su id
    boolean existsById(String id);

    // Para buscar listings por nombre
    List<Listings> findByNameContainingIgnoreCase(String name);

}
