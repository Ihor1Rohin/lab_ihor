package com.ihor.lab_ihor.controller;

import com.ihor.lab_ihor.model.Flight;
import com.ihor.lab_ihor.service.FlightService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    // доступ: USER + ADMIN
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    // доступ: USER + ADMIN
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @GetMapping("/number/{flightNumber}")
    public List<Flight> getByFlightNumber(@PathVariable String flightNumber) {
        return flightService.getFlightsByFlightNumber(flightNumber);
    }

    // доступ: тільки ADMIN
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.createFlight(flight);
    }
}