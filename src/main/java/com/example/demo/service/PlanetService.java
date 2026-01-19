package com.example.demo.service;
import com.example.demo.model.Planet;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.springframework.core.io.ClassPathResource;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

@Service
public class PlanetService {
    //make the empty ArrayList to hold the planets
    private ArrayList<Planet> planets = new ArrayList<>();

    //PostConstruct method to load the planets from the file automatically on startup
    @PostConstruct
    public void init() {
        planets = loadPlanetsFromFile();
        System.out.println("Planets loaded: " + planets.size());
    }
    
    //method to load planets from a file, return the ArrayList of planets
    //will be called in the PostConstruct method to load the planets on startup
    public ArrayList<Planet> loadPlanetsFromFile() {
        
        ArrayList<Planet> planets = new ArrayList<>();

        // Load the planet information text file from classpath resources
        Scanner sc = null;
        try {
            ClassPathResource resource = new ClassPathResource("planets.txt");
            sc = new Scanner(new InputStreamReader(resource.getInputStream()));
        } catch (Exception e) {
            // Log and handle the exception
            e.printStackTrace();
        }

        // Read each line of the file, split it by commas, and create a new Planet object with the data
        //while loop repeats for each line in the file, aka each planet

        sc.nextLine(); // Skip the header line
        
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            
            String[] parts = line.split(",");

            //call the Planet constructor with the data from the file to create a new Planet object
            Planet planet = new Planet(
                    parts[0],               // name
                    Integer.parseInt(parts[1]),               // size
                    Float.parseFloat(parts[2]), // distance from sun
                    Integer.parseInt(parts[3]), // number of moons
                    parts[4]                // description
            );

            planets.add(planet);
        }
        return planets;
    }

    //getter for the planets ArrayList
    public ArrayList<Planet> getAllPlanets() {
        return planets;
    }
}

