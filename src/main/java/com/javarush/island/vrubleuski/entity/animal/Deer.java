package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.entity.area.Location;

public class Deer extends Herbivore implements Eatable {
    private final ConfigAnimal deer;
    public Deer(Location location) {
        super(location);
        this.deer = ConfigAnimal.DEER;
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
