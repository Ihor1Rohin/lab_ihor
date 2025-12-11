package com.ihor.lab_ihor.model;
import java.time.LocalDateTime;


public class Flight {
    private Long id;
    private String departure;
    private String arrival;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private Double price;
    private String flightNumber;
    private LocalDateTime creationDate;

    public Flight() {}

    public Flight(Long id, String departure, String arrival,
                  LocalDateTime departureDateTime,
                  LocalDateTime arrivalDateTime,
                  Double price,
                  String flightNumber,
                  LocalDateTime creationDate) {

        this.id = id;
        this.departure = departure;
        this.arrival = arrival;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.price = price;
        this.flightNumber = flightNumber;
        this.creationDate = creationDate;
    }

    public Long getId() { return id; }
    public String getDeparture() { return departure; }
    public String getArrival() { return arrival; }
    public LocalDateTime getDepartureDateTime() { return departureDateTime; }
    public LocalDateTime getArrivalDateTime() { return arrivalDateTime; }
    public Double getPrice() { return price; }
    public String getFlightNumber() { return flightNumber; }
    public LocalDateTime getCreationDate() { return creationDate; }

    public void setId(Long id) { this.id = id; }
    public void setDeparture(String departure) { this.departure = departure; }
    public void setArrival(String arrival) { this.arrival = arrival; }
    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }
    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }
    public void setPrice(Double price) { this.price = price; }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
