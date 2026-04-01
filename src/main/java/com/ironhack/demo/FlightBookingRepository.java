package com.ironhack.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightBookingRepository extends JpaRepository<FlightBooking,Integer> {
}
