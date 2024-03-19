package com.javarush.island.vrubleuski;

import com.javarush.island.vrubleuski.configuration.ConfigIsland;
import com.javarush.island.vrubleuski.entity.animal.*;
import com.javarush.island.vrubleuski.entity.area.Island;
import com.javarush.island.vrubleuski.entity.area.Location;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Island island = new Island(ConfigIsland.WIDTH, ConfigIsland.HEIGHT);
        for (int i = 0; i < island.getLocations().length; i++) {
            for (int j = 0; j < island.getLocations()[i].length; j++) {
                island.getLocations()[i][j] = new Location();
            }
        }
        List<Animal> animals = island.getLocations()[0][0].getAnimals();
        Animal animal = new Wolf(island.getLocations()[0][0]);
        System.out.println(animal.);
    }

}
