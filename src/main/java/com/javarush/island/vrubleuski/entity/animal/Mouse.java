package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.entity.area.Location;

public class Mouse extends Herbivore implements Eatable {
    public Mouse(Location location) {
        super(location);
        this.animal = ConfigAnimal.MOUSE;
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
