package com.example.gestioncinemas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class TicketPlace {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double prix;
    private String nomClient;
    private int codePayement;
    private boolean reserve;
    @ManyToOne(fetch = FetchType.LAZY)
    private  FilmProjection filmProjection;
    @ManyToOne(fetch = FetchType.LAZY)
    private Place place;
}
