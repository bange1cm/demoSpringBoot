package com.example.demo.model;

public class Planet {
    String name;
    int size;
    float distanceFromSun;
    int numberOfMoons;
    String description;

    //constructor
    public Planet(String name, int size, float distanceFromSun, int numberOfMoons, String description) {
        this.name = name;
        this.size = size;
        this.distanceFromSun = distanceFromSun;
        this.numberOfMoons = numberOfMoons;
        this.description = description;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public float getDistanceFromSun() {
        return distanceFromSun;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    public String getDescription() {
        return description;
    }
    
}
