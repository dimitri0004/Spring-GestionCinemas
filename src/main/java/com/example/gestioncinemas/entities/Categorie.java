package com.example.gestioncinemas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Categorie {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String categorieName;
    @OneToMany(mappedBy = "categorie", fetch = FetchType.LAZY)
    private Collection<Film> films;
}
