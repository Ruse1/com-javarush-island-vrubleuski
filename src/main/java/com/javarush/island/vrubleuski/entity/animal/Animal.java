package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.App;
import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.configuration.ConfigIsland;
import com.javarush.island.vrubleuski.entity.area.Location;
import com.javarush.island.vrubleuski.entity.plant.Plant;
import com.javarush.island.vrubleuski.service.Direction;
import com.javarush.island.vrubleuski.service.Message;
import com.javarush.island.vrubleuski.service.ServiceIsland;

import java.util.Map;

public abstract class Animal {
    protected Location location;
    protected ConfigAnimal animal;
    protected Map<Class<? extends Animal>, Integer> behaviorWithAnimals;
    protected Map<Class<? extends Plant>, Integer> behaviorWithPlants;
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
                    if (behaviorWithAnimals.containsKey(currentAnimal) && behaviorWithAnimals.get(currentAnimal) != 0) {
                        int result = ServiceIsland.randomIntFromTo(0, 100);
                        if (result <= behaviorWithAnimals.get(currentAnimal)) {
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
        if (isHungry(currentSaturation)) {
            for (int i = 0; i < location.getPlants().size(); i++) {
                Plant plant = location.getPlants().get(i);
                if (plant != null) {
                    Class<?> currentPlant = plant.getClass();
                    if (behaviorWithPlants.containsKey(currentPlant) && behaviorWithPlants.get(currentPlant) != 0) {
                        int result = ServiceIsland.randomIntFromTo(0, 100);
                        if (result <= behaviorWithPlants.get(currentPlant)) {
                            setSaturation(plant.getPlant().getWeight());
                            Message.eatenPlant(this, plant);
                            location.getPlants().set(i, null);
                            if (!isHungry(currentSaturation)) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
    public void move() {
        Direction direction = chooseDirection();
        int indexAnimal = location.getAnimals().indexOf(this);
        Animal currentAnimal = location.getAnimals().get(indexAnimal);
        for (int i = 0; i < App.island.getLocations().length; i++) {
            for (int j = 0; j < App.island.getLocations()[i].length; j++) {
                if (location.getNumberLocation() == App.island.getLocations()[i][j].getNumberLocation()) {
                    int speed = animal.getSpeed();
                    if (direction == Direction.UP) {
                        int shift = j - speed;
                        System.out.println(shift);
                        if (shift >= 0) {
                            if (App.island.getLocations()[i][shift].getCountAnimals(this.getClass()) < animal.getCountInLocation()) {
                                App.island.getLocations()[i][shift].getDeserterAnimals().add(currentAnimal);
                                location.getAnimals().set(indexAnimal, null);
                            }
                        } else {
                            if (App.island.getLocations()[i][ConfigIsland.HEIGHT + j - speed].getCountAnimals(this.getClass()) < animal.getCountInLocation()) {
                                App.island.getLocations()[i][ConfigIsland.HEIGHT + j - speed].getDeserterAnimals().add(currentAnimal);
                                location.getAnimals().set(indexAnimal, null);
                            }
                        }
                    } else if (direction == Direction.DOWN) {
                        int shift = j + speed;
                        if (shift < ConfigIsland.HEIGHT) {
                            if (App.island.getLocations()[i][shift].getCountAnimals(this.getClass()) < animal.getCountInLocation()) {
                                App.island.getLocations()[i][shift].getDeserterAnimals().add(currentAnimal);
                                location.getAnimals().set(indexAnimal, null);
                            }
                        } else {
                            if (App.island.getLocations()[i][shift - ConfigIsland.HEIGHT].getCountAnimals(this.getClass()) < animal.getCountInLocation()) {
                                App.island.getLocations()[i][shift - ConfigIsland.HEIGHT].getDeserterAnimals().add(currentAnimal);
                                location.getAnimals().set(indexAnimal, null);
                            }
                        }
                    } else if (direction == Direction.RIGHT) {
                        int shift = i + speed;
                        if (shift < ConfigIsland.WIDTH) {
                            if (App.island.getLocations()[shift][j].getCountAnimals(this.getClass()) < animal.getCountInLocation()) {
                                App.island.getLocations()[shift][j].getDeserterAnimals().add(currentAnimal);
                                location.getAnimals().set(indexAnimal, null);
                            }
                        } else {
                            if (App.island.getLocations()[shift - ConfigIsland.WIDTH][j].getCountAnimals(this.getClass()) < animal.getCountInLocation()) {
                                App.island.getLocations()[shift - ConfigIsland.WIDTH][j].getDeserterAnimals().add(currentAnimal);
                                location.getAnimals().set(indexAnimal, null);
                            }
                        }
                    } else if (direction == Direction.LEFT) {
                        int shift = i - speed;
                        System.out.println(shift);
                        if (shift >= 0) {
                            if (App.island.getLocations()[shift][j].getCountAnimals(this.getClass()) < animal.getCountInLocation()) {
                                App.island.getLocations()[shift][j].getDeserterAnimals().add(currentAnimal);
                                location.getAnimals().set(indexAnimal, null);
                            }
                        } else {
                            if (App.island.getLocations()[ConfigIsland.WIDTH + i - speed][j].getCountAnimals(this.getClass()) < animal.getCountInLocation()) {
                                App.island.getLocations()[ConfigIsland.WIDTH + i - speed][j].getDeserterAnimals().add(currentAnimal);
                                location.getAnimals().set(indexAnimal, null);
                            }
                        }
                    }
                }
            }
        }
    }

    protected Direction chooseDirection() {
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
            currentSaturation = (double) Math.round((weightFood + currentSaturation) * 100) / 100; //округление до сотых
            if (currentSaturation >= animal.getFullSaturation()) {
                currentSaturation = animal.getFullSaturation();
            }
        }
    }

    protected boolean isHungry(double saturation) {
        return saturation >= animal.getFullSaturation() ? false : true;
    }

    protected void removeExcess() {
        if (location.getCountAnimals(this.getClass()) > animal.getCountInLocation()) {
            int quantity = 0;
            for (int i = 0; i < location.getAnimals().size(); i++) {
                if (location.getAnimals().get(i).getClass() == this.getClass()) {
                    quantity++;
                }
                if (quantity > getAnimalConfig().getCountInLocation()) {
                    location.getAnimals().set(i, null);
                }
            }
        }
    }
}
