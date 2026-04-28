package com.ihor.lab_ihor.model;

import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class City {

    @Id
    @Column(name = "city_id")
    private Integer id;

    @Column(name = "display_name")
    private String displayName;

    public Integer getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }
}