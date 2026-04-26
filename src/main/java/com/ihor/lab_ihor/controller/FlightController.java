package com.ihor.lab_ihor.controller;

import com.ihor.lab_ihor.model.Flight;
import com.ihor.lab_ihor.service.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    // GET /flights
    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    // GET /flights/number/{flightNumber}
    @GetMapping("/number/{flightNumber}")
    public List<Flight> getByFlightNumber(@PathVariable String flightNumber) {
        return flightService.getFlightsByFlightNumber(flightNumber);
    }

    // POST /flights
    @PostMapping
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.createFlight(flight);
    }
}