package com.javarush.island.vrubleuski.service;

import com.javarush.island.vrubleuski.entity.animal.Animal;

public class Message {
    public static void killAnimal(Animal killer, Animal sacrifice) {
        System.out.printf("Животное %s убило и съело %s в локации №%d, текущее значение сытости %s\n",
                killer.getAnimalConfig().getImage(),
                sacrifice.getAnimalConfig().getImage(),
                killer.getLocation().getNumberLocation(),
                killer.getCurrentSaturation());
    }
}
