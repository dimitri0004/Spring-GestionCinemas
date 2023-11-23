package com.example.gestioncinemas.repository;

import com.example.gestioncinemas.entities.Cinema;
import com.example.gestioncinemas.entities.TicketPlace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketPlaceRepository extends JpaRepository<TicketPlace,Long> {
}
