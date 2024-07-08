package com.panha.demo_core_backend.controllers;

import com.panha.demo_core_backend.models.Bike;
import com.panha.demo_core_backend.repositories.BikeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/bike")
public class BikeController {
    private final BikeRepository bikeRepository;

    BikeController(BikeRepository bikeRepository){
        this.bikeRepository = bikeRepository;
    }
    @GetMapping
    public List<Bike> getAllBikes() {
        return bikeRepository.findAll();
    }
}
