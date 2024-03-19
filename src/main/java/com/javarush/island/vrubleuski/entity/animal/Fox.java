package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.entity.area.Location;

public class Fox extends Predator implements Eatable {
    private final ConfigAnimal fox;

    public Fox(Location location) {
        super(location);
        this.fox = ConfigAnimal.FOX;
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
