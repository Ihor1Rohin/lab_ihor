package com.ihor.lab_ihor.model;

import jakarta.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "departure_city_id")
    private City departureCity;

    @ManyToOne
    @JoinColumn(name = "arrival_city_id")
    private City arrivalCity;

    @Column(name = "departure_time")
    private OffsetDateTime departureTime;

    @Column(name = "arrival_time")
    private OffsetDateTime arrivalTime;

    @Column(name = "flight_number")
    private String flightNumber;

    private Double price;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;

    public Integer getId() { return id; }
    public City getDepartureCity() { return departureCity; }
    public City getArrivalCity() { return arrivalCity; }
    public OffsetDateTime getDepartureTime() { return departureTime; }
    public OffsetDateTime getArrivalTime() { return arrivalTime; }
    public String getFlightNumber() { return flightNumber; }
    public Double getPrice() { return price; }
    public OffsetDateTime getCreatedAt() { return createdAt; }

    public void setDepartureCity(City departureCity) { this.departureCity = departureCity; }
    public void setArrivalCity(City arrivalCity) { this.arrivalCity = arrivalCity; }
    public void setDepartureTime(OffsetDateTime departureTime) { this.departureTime = departureTime; }
    public void setArrivalTime(OffsetDateTime arrivalTime) { this.arrivalTime = arrivalTime; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }
    public void setPrice(Double price) { this.price = price; }
    public void setCreatedAt(OffsetDateTime createdAt) { this.createdAt = createdAt; }
}