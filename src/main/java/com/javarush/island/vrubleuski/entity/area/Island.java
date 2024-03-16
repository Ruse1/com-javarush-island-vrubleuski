package com.javarush.island.vrubleuski.entity.area;

public class Island {
    private final Location[][] locations;

    public Island(Location[][] locations) {
        this.locations = locations;
    }

    public Location[][] getLocations() {
        return locations;
    }
}
