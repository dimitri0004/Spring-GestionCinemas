package com.example.gestioncinemas.repository;


import com.example.gestioncinemas.entities.FilmProjection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmProjectionRepository extends JpaRepository<FilmProjection,Long> {
}
