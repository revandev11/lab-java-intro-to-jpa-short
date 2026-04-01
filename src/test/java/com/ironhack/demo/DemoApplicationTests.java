package com.ironhack.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private FlightRepository flightRepository;
	
	@Autowired
	private FlightBookingRepository flightBookingRepository;

	@Test
	void contextLoads() {
	}
	
	@Test
	void testCreateCustomer() {
		Customer customer = new Customer(null, "Ayaz", CustomerStatus.Gold, 1000);
		Customer saved = customerRepository.save(customer);
		
		assertNotNull(saved.getCustomerId());
		assertEquals("Ayaz", saved.getCustomerName());
	}
	
	@Test
	void testCreateFlight() {
		Flight flight = new Flight(null, "AZ001", "Boeing 737", 180, 2500);
		Flight saved = flightRepository.save(flight);
		
		assertNotNull(saved.getFlightId());
		assertEquals("AZ001", saved.getFlightNumber());
	}
	
	@Test
	void testCreateBooking() {
		// Müştəri və reysi saxla
		Customer customer = customerRepository.save(
			new Customer(null, "Leyla", CustomerStatus.Silver, 5000)
		);
		Flight flight = flightRepository.save(
			new Flight(null, "TK100", "Airbus A320", 150, 3000)
		);
		
		// Booking yarat
		FlightBooking booking = new FlightBooking();
		booking.setCustomerId(customer.getCustomerId());
		booking.setFlightId(flight.getFlightId());
		FlightBooking saved = flightBookingRepository.save(booking);
		
		assertNotNull(saved.getBookingId());
	}

}
