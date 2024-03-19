package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.entity.area.Location;

public class Caterpillar extends Herbivore implements Eatable {
    private final ConfigAnimal caterpillar;

    public Caterpillar(Location location) {
        super(location);
        this.caterpillar = ConfigAnimal.CATERPILLAR;
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
