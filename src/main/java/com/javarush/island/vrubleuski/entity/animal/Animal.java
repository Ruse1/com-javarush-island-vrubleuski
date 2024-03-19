package com.javarush.island.vrubleuski.entity.animal;

public abstract class Animal {
    protected double currentSaturation;
    protected abstract void eat ();
    protected abstract void move ();
    protected abstract void chooseDirection ();
    protected abstract void breed();
}
