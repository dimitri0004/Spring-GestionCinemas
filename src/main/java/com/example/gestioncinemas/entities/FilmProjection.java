package com.example.gestioncinemas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class FilmProjection {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Temporal(TemporalType.DATE)
    private Date dateProjection;
    private double price;
    @ManyToOne(fetch = FetchType.LAZY)
    private Film film;
    @ManyToOne(fetch = FetchType.LAZY)
    private  Salle salle;
    @OneToOne(fetch = FetchType.LAZY)
    private Seance seance;
    @OneToMany(mappedBy = "filmProjection", fetch = FetchType.LAZY)
    private Collection<TicketPlace> ticketPlaces;
}
