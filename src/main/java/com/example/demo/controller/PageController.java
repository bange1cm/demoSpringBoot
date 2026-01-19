package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.PlanetService;
import com.example.demo.model.Planet;
import java.util.List;



@RestController
public class PageController {

    //PlanetService object
    private final PlanetService planetService;
    public PageController(PlanetService planetService) {
        this.planetService = planetService;
    }

    // mapping request to /planets, return the list of planets as JSON
    @GetMapping("/planets")
    public List<Planet> getPlanets() {
        return planetService.getAllPlanets();
    }
}