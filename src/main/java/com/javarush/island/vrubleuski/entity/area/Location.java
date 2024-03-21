package com.javarush.island.vrubleuski.entity.area;

import com.javarush.island.vrubleuski.entity.animal.Animal;
import com.javarush.island.vrubleuski.entity.plant.Plant;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private List<Animal> animals;
    private List<Plant> plants;
    private int numberLocation;
    private static int amountLocation = 0;

    public Location() {
        this.animals = new ArrayList<>();
        this.plants = new ArrayList<>();
        amountLocation++;
        numberLocation = amountLocation;
    }

    public int getCountAnimals(Class<? extends Animal> clazz) {
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

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public int getNumberLocation() {
        return numberLocation;
    }
    public void getEatableAnimals (){

    }

}
