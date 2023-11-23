package com.example.gestioncinemas.repository;

import com.example.gestioncinemas.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema,Long> {
}
