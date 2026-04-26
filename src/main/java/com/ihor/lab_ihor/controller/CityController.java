package com.ihor.lab_ihor.controller;

import com.ihor.lab_ihor.model.City;
import com.ihor.lab_ihor.service.CityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    public List<City> allCities() {
        return cityService.getAllCities();
    }
}