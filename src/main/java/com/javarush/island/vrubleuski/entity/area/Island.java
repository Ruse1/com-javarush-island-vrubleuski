package com.javarush.island.vrubleuski.entity.area;


public class Island {
    private final Location[][] locations;

    public Island(int width, int height) {
        this.locations = new Location[width][height];
        createLocations();
    }

    public Location[][] getLocations() {
        return locations;
    }

    private void createLocations() {
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; j++){
                locations[i][j] = new Location();
            }
        }
    }
}
