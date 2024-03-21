package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.configuration.ConfigIsland;
import com.javarush.island.vrubleuski.entity.area.Location;

public class Bear extends Predator {

    public Bear(Location location) {
        super(location);
        this.animal = ConfigAnimal.BEAR;
        this.behavior = ConfigIsland.SETTINGS_BEHAVIOR_ANIMALS.get(this.getClass());
    }

    @Override
    public void move() {

    }

    @Override
    public void breed() {

    }
}
