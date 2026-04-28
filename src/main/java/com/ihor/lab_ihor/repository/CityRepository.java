package com.ihor.lab_ihor.repository;

import com.ihor.lab_ihor.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}