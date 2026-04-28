package com.ihor.lab_ihor.model;

import jakarta.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @ManyToOne
    @JoinColumn(name = "user_profile_id")
    private UserProfile user;

    private String pnr;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;

    public Integer getId() { return id; }
    public Flight getFlight() { return flight; }
    public UserProfile getUser() { return user; }
    public String getPnr() { return pnr; }
    public OffsetDateTime getCreatedAt() { return createdAt; }

    public void setFlight(Flight flight) { this.flight = flight; }
    public void setUser(UserProfile user) { this.user = user; }
    public void setPnr(String pnr) { this.pnr = pnr; }
    public void setCreatedAt(OffsetDateTime createdAt) { this.createdAt = createdAt; }
}