package com.ihor.lab_ihor.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.time.OffsetDateTime;

@Entity
@Table(name = "user_profile")
public class UserProfile {

    @Id
    @Column(name = "user_profile_id")
    private Integer id;

    private String firstName;
    private String lastName;
    private String username;
    private String password;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;

    public Integer getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public OffsetDateTime getCreatedAt() { return createdAt; }
}