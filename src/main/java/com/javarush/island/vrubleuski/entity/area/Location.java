package com.javarush.island.vrubleuski.entity.area;

import com.javarush.island.vrubleuski.entity.animal.Animal;
import com.javarush.island.vrubleuski.entity.plant.Plant;
import com.javarush.island.vrubleuski.service.ServiceIsland;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private List<Animal> animals;
    private List<Plant> plants;
    private List<Animal> newbornAnimals;
    private int numberLocation;
    private static int amountLocation = 0;

    public Location() {
        this.animals = new ArrayList<>();
        this.plants = new ArrayList<>();
        this.newbornAnimals = new ArrayList<>();
        amountLocation++;
        numberLocation = amountLocation;
    }

    public int getCountAnimals(Class<? extends Animal> kind) {
        int count = 0;
        ServiceIsland.removeNull(animals);
        for (Animal animal : animals) {
            if (animal.getClass() == kind) {
                count++;
            }
        }
        return count;
    }
    public int getCountNewbornAnimals(Class<? extends Animal> kind) {
        int count = 0;
        ServiceIsland.removeNull(newbornAnimals);
        for (Animal animal : newbornAnimals) {
            if (animal.getClass() == kind) {
                count++;
            }
        }
        return count;
    }

    public int getCountPlants() {
        return plants.size();
    }

    public List<Animal> getAnimals() {
        ServiceIsland.removeNull(animals);
        return animals;
    }

    public List<Plant> getPlants() {
        ServiceIsland.removeNull(plants);
        return plants;
    }

    public int getNumberLocation() {
        return numberLocation;
    }

    public List<Animal> getNewbornAnimals() {
        return newbornAnimals;
    }
}
