package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.entity.area.Location;

public class Bear extends Predator {
    private final ConfigAnimal bear;

    public Bear(Location location) {
        super(location);
        this.bear = ConfigAnimal.BEAR;
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void chooseDirection() {

    }

    @Override
    public void breed() {

    }
}
