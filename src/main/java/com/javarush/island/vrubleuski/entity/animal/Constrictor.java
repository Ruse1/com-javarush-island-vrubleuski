package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.configuration.ConfigIsland;
import com.javarush.island.vrubleuski.entity.area.Location;

public class Constrictor extends Predator implements Eatable {

    public Constrictor(Location location) {
        super(location);
        this.animal = ConfigAnimal.CONSTRICTOR;
        this.behavior = ConfigIsland.SETTINGS_BEHAVIOR_ANIMALS.get(this.getClass());
    }

    @Override
    public void move() {

    }

    @Override
    public void breed() {

    }
}
