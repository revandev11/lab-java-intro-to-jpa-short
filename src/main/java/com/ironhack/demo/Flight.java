package com.ironhack.demo;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
@Table
public class Flight {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer flightId;
    @Column(nullable = false,unique = true,name = "flight_number")
    private String flightNumber;
    @Column(nullable = false)
    private String aircraft;
    @Column(nullable = false)
    private Integer totalAircraftSeats;
    @Column(nullable = false,name = " flight_mileage")
    private Integer flightMileage;

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public Integer getTotalAircraftSeats() {
        return totalAircraftSeats;
    }

    public void setTotalAircraftSeats(Integer totalAircraftSeats) {
        this.totalAircraftSeats = totalAircraftSeats;
    }

    public Integer getFlightMileage() {
        return flightMileage;
    }

    public void setFlightMileage(Integer flightMileage) {
        this.flightMileage = flightMileage;
    }

    public Flight(){}

    public Flight(Integer flightId, String flightNumber, String aircraft, Integer totalAircraftSeats, Integer flightMileage) {
        this.flightId = flightId;
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.totalAircraftSeats = totalAircraftSeats;
        this.flightMileage = flightMileage;
    }
}
