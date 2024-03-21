package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.entity.area.Location;

public class Rabbit extends Herbivore implements Eatable {
    public Rabbit(Location location) {
        super(location);
        this.animal = ConfigAnimal.RABBIT;
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void breed() {

    }
}
