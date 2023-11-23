package com.example.gestioncinemas.repository;

import com.example.gestioncinemas.entities.Cinema;
import com.example.gestioncinemas.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place,Long> {
}
