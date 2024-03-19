package com.javarush.island.vrubleuski.entity.area;


public class Island {
    private final Location[][] locations;

    public Island(int width, int height) {
        this.locations = new Location[width][height];
    }

    public Location[][] getLocations() {
        return locations;
    }
}
