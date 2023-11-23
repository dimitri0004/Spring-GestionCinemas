package com.example.gestioncinemas.repository;

import com.example.gestioncinemas.entities.Cinema;
import com.example.gestioncinemas.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VilleRepository extends JpaRepository<Ville,Long> {
}
