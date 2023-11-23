package com.example.gestioncinemas.repository;

import com.example.gestioncinemas.entities.Cinema;
import com.example.gestioncinemas.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalleRepository extends JpaRepository<Salle,Long> {
}
