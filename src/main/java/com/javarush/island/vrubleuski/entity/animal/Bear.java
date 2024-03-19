package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;

public class Bear extends Predator {
    private final ConfigAnimal bear;
    public Bear() {
        this.bear = ConfigAnimal.BEAR;
    }

    @Override
    protected void eat() {

    }

    @Override
    protected void move() {

    }

    @Override
    protected void chooseDirection() {

    }

    @Override
    protected void breed() {

    }
}
