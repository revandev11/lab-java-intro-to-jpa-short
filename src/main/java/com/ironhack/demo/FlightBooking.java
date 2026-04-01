package com.ironhack.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "bookings")
public class FlightBooking {
    @Id
    @Column(name = "booking_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookingId;

    @Column(name = "flight_id")
    private int flightId;

    @Column(name = "customer_id")
    private int customerId;

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public FlightBooking(Integer customerId, Integer flightId) {
        this.customerId = customerId;
        this.flightId = flightId;
    }
    public FlightBooking() {
    }



}
