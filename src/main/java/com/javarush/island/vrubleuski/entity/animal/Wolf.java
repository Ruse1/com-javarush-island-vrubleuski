package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.configuration.ConfigIsland;
import com.javarush.island.vrubleuski.entity.area.Location;
import com.javarush.island.vrubleuski.service.Message;
import com.javarush.island.vrubleuski.service.ServiceIsland;

import java.util.Map;


public class Wolf extends Predator {

    public Wolf(Location location) {
        super(location);
        this.animal = ConfigAnimal.WOLF;
        this.behavior = ConfigIsland.SETTINGS_BEHAVIOR_ANIMALS.get(this.getClass());
    }
    @Override
    public void move() {

    }

    @Override
    public void breed() {

    }
}
