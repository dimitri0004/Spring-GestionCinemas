package com.example.gestioncinemas.repository;

import com.example.gestioncinemas.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
