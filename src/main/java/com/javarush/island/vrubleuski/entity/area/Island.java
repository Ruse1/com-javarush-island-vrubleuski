package com.javarush.island.vrubleuski.entity.area;

import java.util.Map;

public class Island {
    private final Location[][] locations;
    private Map<Class<?>, Map<Class<?>, Integer>> behaviorAnimals;
    private Map<Class<?>, Integer> countAnimalsOneLocations;


    public Island(int width, int height) {
        this.locations = new Location[width][height];
    }
    public Location[][] getLocations() {
        return locations;
    }
    public Map<Class<?>, Map<Class<?>, Integer>> getBehaviorAnimals() {
        return behaviorAnimals;
    }

    public void setBehaviorAnimals(Map<Class<?>, Map<Class<?>, Integer>> behaviorAnimals) {
        this.behaviorAnimals = behaviorAnimals;
    }

    public Map<Class<?>, Integer> getCountAnimalsOneLocations() {
        return countAnimalsOneLocations;
    }

    public void setCountAnimalsOneLocations(Map<Class<?>, Integer> countAnimalsOneLocations) {
        this.countAnimalsOneLocations = countAnimalsOneLocations;
    }
}
