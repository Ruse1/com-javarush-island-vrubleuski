package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.entity.area.Location;

public class Buffalo extends Herbivore implements Eatable {
    public Buffalo(Location location) {
        super(location);
        this.animal = ConfigAnimal.BUFFALO;
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
