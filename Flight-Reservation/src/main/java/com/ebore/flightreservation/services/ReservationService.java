package com.ebore.flightreservation.services;

import com.ebore.flightreservation.dto.ReservationRequest;
import com.ebore.flightreservation.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);
}
