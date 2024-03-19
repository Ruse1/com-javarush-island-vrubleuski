package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.entity.area.Location;

public abstract class Animal {
    protected Location location;
    protected double currentSaturation;

    public Animal(Location location) {
        this.location = location;
        currentSaturation = 0;
    }

    public abstract void eat ();
    public abstract void move ();
    public abstract void chooseDirection ();
    public abstract void breed();
}
