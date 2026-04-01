package com.ironhack.demo;

import jakarta.persistence.*;

@Entity
@Table
public class FlightBooking {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookingId;
    @ManyToOne
    @JoinColumn(name = "flight_id",referencedColumnName = "flightId")
    private Flight flight;
    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName = "customerId")
    private Customer customer;

public FlightBooking(){}
    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
