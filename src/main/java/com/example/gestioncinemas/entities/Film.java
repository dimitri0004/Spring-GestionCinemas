package com.example.gestioncinemas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Film {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titre;
    private String realisateur;
    private String description;
    private String photo;
    @OneToMany(mappedBy = "film", fetch = FetchType.LAZY)
    Collection<FilmProjection> filmProjections;
    @ManyToOne(fetch = FetchType.LAZY)
    private Categorie categorie;
}
