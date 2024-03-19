package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.entity.area.Location;

public class Duck extends Herbivore implements Eatable {
    private final ConfigAnimal duck;
    public Duck(Location location) {
        super(location);
        this.duck = ConfigAnimal.DUCK;
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
