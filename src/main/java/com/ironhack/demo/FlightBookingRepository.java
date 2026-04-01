package com.ironhack.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightBookingRepository extends JpaRepository<FlightBooking,Integer> {
    
    // Müştərinin bütün booking-lərini tapın
    List<FlightBooking> findByCustomerId(int customerId);
    
    // Reysin bütün booking-lərini tapın
    List<FlightBooking> findByFlightId(int flightId);
    
    // Müştəri və reys əsasında booking tapın
    FlightBooking findByCustomerIdAndFlightId(int customerId, int flightId);
    
    // Və ya JPQL sorğu ilə:
    @Query("SELECT b FROM FlightBooking b WHERE b.customerId = ?1")
    List<FlightBooking> getCustomerBookings(int customerId);
}
