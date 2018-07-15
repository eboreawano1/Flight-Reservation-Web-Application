package com.ebore.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebore.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {

}
