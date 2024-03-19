package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.entity.area.Location;

public class Constrictor extends Predator implements Eatable {
    private final ConfigAnimal constrictor;

    public Constrictor(Location location) {
        super(location);
        this.constrictor = ConfigAnimal.CONSTRICTOR;
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
