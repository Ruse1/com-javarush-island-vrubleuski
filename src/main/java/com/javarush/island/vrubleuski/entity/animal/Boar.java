package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.entity.area.Location;

public class Boar extends Herbivore implements Eatable {
    private final ConfigAnimal boar;
    public Boar(Location location) {
        super(location);
        this.boar = ConfigAnimal.BOAR;
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
