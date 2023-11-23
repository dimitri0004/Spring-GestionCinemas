package com.example.gestioncinemas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Ville {

   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   private double longitude, laltitude,altitude;
   private int nombreHabitant;
   @OneToMany(mappedBy = "ville" , fetch = FetchType.LAZY)
   private Collection<Cinema> cinemas;
}
