package com.example.gestioncinemas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Salle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int nombrePlaces;
    @ManyToOne(fetch = FetchType.LAZY)
    private Cinema cinema;
    @OneToMany(mappedBy = "salle" , fetch = FetchType.LAZY)
    private Collection<Place> places;
    @OneToMany(mappedBy = "salle" , fetch = FetchType.LAZY)
    private Collection<FilmProjection> filmProjections;

}
