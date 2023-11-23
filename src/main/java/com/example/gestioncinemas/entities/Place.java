package com.example.gestioncinemas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Place {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int numeroPlace ;
    private double longitude, laltitude, altitude;
    @ManyToOne(fetch = FetchType.LAZY)
    private Salle salle;
    @OneToMany(mappedBy = "place", fetch = FetchType.LAZY)
    private Collection<TicketPlace> ticketPlaces;

}
