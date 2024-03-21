package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.entity.area.Location;
import com.javarush.island.vrubleuski.service.Direction;
import com.javarush.island.vrubleuski.service.Message;
import com.javarush.island.vrubleuski.service.ServiceIsland;

import java.util.Map;

public abstract class Animal {
    protected Location location;
    protected ConfigAnimal animal;
    protected Map<Class<?>, Integer> behavior;
    protected double currentSaturation;

    public Animal(Location location) {
        this.location = location;
        currentSaturation = 0;
    }

    public void eat() {
        if (isHungry(currentSaturation)) {
            for (int i = 0; i < location.getAnimals().size(); i++) {
                Animal animal = location.getAnimals().get(i);
                if (animal != null) {
                    Class<?> currentAnimal = animal.getClass();
                    if (behavior.containsKey(currentAnimal) && behavior.get(currentAnimal) != 0) {
                        int result = ServiceIsland.randomIntFromTo(behavior.get(currentAnimal), 100);
                        if (result <= behavior.get(currentAnimal)) {
                            Animal killedAnimal = location.getAnimals().get(i);
                            setSaturation(killedAnimal.animal.getWeight());
                            Message.killAnimal(this, killedAnimal);
                            location.getAnimals().set(i, null);
                            if (!isHungry(currentSaturation)) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
    public abstract void move();

    public Direction chooseDirection() {
        int result = ServiceIsland.randomInt(Direction.values().length);
        return Direction.values()[result];
    }

    public abstract void breed();

    public double getCurrentSaturation() {
        return currentSaturation;
    }

    public ConfigAnimal getAnimalConfig() {
        return animal;
    }

    public Location getLocation() {
        return location;
    }

    protected void setSaturation(double weightFood) {
        if (weightFood > animal.getFullSaturation()) {
            currentSaturation = animal.getFullSaturation();
        } else {
            currentSaturation = (double) Math.round((weightFood + currentSaturation) * 100) / 100;
            if (currentSaturation >= animal.getFullSaturation()) {
                currentSaturation = animal.getFullSaturation();
            }
        }
    }

    protected boolean isHungry(double saturation) {
        return saturation >= animal.getFullSaturation() ? false : true;
    }
}
