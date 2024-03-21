package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.entity.area.Location;

public class Sheep extends Herbivore implements Eatable {
    public Sheep(Location location) {
        super(location);
        this.animal = ConfigAnimal.SHEEP;
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
