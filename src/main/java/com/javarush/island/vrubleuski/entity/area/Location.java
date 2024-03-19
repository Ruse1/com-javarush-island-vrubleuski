package com.javarush.island.vrubleuski.entity.area;

import com.javarush.island.vrubleuski.entity.animal.Animal;
import com.javarush.island.vrubleuski.entity.plant.Plant;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private List<Animal> animals;
    private List<Plant> plants;

    public Location() {
        this.animals = new ArrayList<>();
        this.plants = new ArrayList<>();
    }

    public int getCountAnimals(Class<?> clazz) {
        int count = 0;
        for (Animal animal : animals) {
            if (animal.getClass() == clazz) {
                count++;
            }
        }
        return count;
    }

    public int getCountPlants() {
        return plants.size();
    }
}
