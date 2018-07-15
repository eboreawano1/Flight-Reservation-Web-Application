package com.ebore.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebore.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}
