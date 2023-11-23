package com.example.gestioncinemas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Cinema {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double longitude , laltitude, altitude;
    private int nombreSalle;
    @ManyToOne(fetch = FetchType.LAZY)
    private Ville ville;
    @OneToMany(mappedBy = "salle", fetch = FetchType.LAZY)
    private Collection<Salle> salle;
}
