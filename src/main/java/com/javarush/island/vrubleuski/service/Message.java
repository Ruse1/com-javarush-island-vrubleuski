package com.javarush.island.vrubleuski.service;

import com.javarush.island.vrubleuski.entity.animal.Animal;
import com.javarush.island.vrubleuski.entity.plant.Plant;

public class Message {
    public static void killAnimal(Animal killer, Animal sacrifice) {
        System.out.printf("Животное %s убило и съело %s в локации №%d, текущее значение сытости %s\n",
                killer.getAnimalConfig().getImage(),
                sacrifice.getAnimalConfig().getImage(),
                killer.getLocation().getNumberLocation(),
                killer.getCurrentSaturation());
    }
    public static void eatenPlant(Animal killer, Plant sacrifice) {
        System.out.printf("Животное %s съело %s в локации №%d, текущее значение сытости %s\n",
                killer.getAnimalConfig().getImage(),
                sacrifice.getPlant().getImage(),
                killer.getLocation().getNumberLocation(),
                killer.getCurrentSaturation());
    }
}
