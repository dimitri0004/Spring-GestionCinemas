package com.example.gestioncinemas.repository;

import com.example.gestioncinemas.entities.Cinema;
import com.example.gestioncinemas.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film,Long> {
}
