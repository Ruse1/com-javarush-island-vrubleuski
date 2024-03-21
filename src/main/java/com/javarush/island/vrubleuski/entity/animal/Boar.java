package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.entity.area.Location;

public class Boar extends Herbivore implements Eatable {
    public Boar(Location location) {
        super(location);
        this.animal = ConfigAnimal.BOAR;
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
