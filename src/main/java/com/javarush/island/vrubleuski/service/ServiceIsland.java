package com.javarush.island.vrubleuski.service;

import com.javarush.island.vrubleuski.entity.animal.Animal;
import com.javarush.island.vrubleuski.entity.plant.Plant;

import java.util.concurrent.ThreadLocalRandom;

public class ServiceIsland {
    private static ThreadLocalRandom random = ThreadLocalRandom.current();

    public static int randomIntFromTo(int from, int to) {
        return random.nextInt(from, to);
    }
    public static int randomInt(int bound) {
        return random.nextInt(bound);
    }

    public static void dieAnimal(Animal animal) {
        animal = null;
    }
    public static void diePlant(Plant plant) {
        plant = null;
    }

}
