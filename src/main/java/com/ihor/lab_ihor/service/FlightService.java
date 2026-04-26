package com.ihor.lab_ihor.service;

import com.ihor.lab_ihor.model.Flight;
import com.ihor.lab_ihor.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public List<Flight> getFlightsByFlightNumber(String flightNumber) {
        return flightRepository.findByFlightNumber(flightNumber);
    }

    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }
}