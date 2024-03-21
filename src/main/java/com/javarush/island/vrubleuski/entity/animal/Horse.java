package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.entity.area.Location;

public class Horse extends Herbivore implements Eatable {
    public Horse(Location location) {
        super(location);
        this.animal = ConfigAnimal.HORSE;
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
