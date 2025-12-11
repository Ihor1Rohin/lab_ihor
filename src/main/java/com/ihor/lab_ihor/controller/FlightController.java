package com.ihor.lab_ihor.controller;

import com.ihor.lab_ihor.model.Flight;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/flights")

public class FlightController {

    private static final List<Flight> flights = new ArrayList<>();

    static {
        flights.add(new Flight(1L, "Kyiv", "Warsaw",
                LocalDateTime.now().plusDays(1),
                LocalDateTime.now().plusDays(1).plusHours(2),
                120.0, "FR101", LocalDateTime.now()));

        flights.add(new Flight(2L, "Lviv", "Berlin",
                LocalDateTime.now().plusDays(2),
                LocalDateTime.now().plusDays(2).plusHours(3),
                200.0, "FR202", LocalDateTime.now()));
    }

    // GET /flights
    @GetMapping
    public List<Flight> getAllFlights() {
        return flights;
    }

    // GET /flights/{id}
    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable Long id) {
        return flights.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // POST /flights
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Flight createFlight(@RequestBody Flight flight) {
        flight.setId((long) (flights.size() + 1));
        flight.setCreationDate(LocalDateTime.now());
        flights.add(flight);
        return flight;
    }

    // DELETE /flights/{id}
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteFlight(@PathVariable Long id) {
        flights.removeIf(f -> f.getId().equals(id));
    }
}
