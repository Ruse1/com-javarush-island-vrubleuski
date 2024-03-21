package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.entity.area.Location;
import com.javarush.island.vrubleuski.entity.plant.Plant;
import com.javarush.island.vrubleuski.service.Message;
import com.javarush.island.vrubleuski.service.ServiceIsland;

public abstract class Herbivore extends Animal {
    public Herbivore(Location location) {
        super(location);
    }

    @Override
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
                    } else if (behavior.containsKey(Plant.class) && behavior.get(Plant.class) != 0) {
                        int result = ServiceIsland.randomIntFromTo(behavior.get(Plant.class), 100);
                        // доделать метод с поеданием растений или переделать
                    }
                }
            }
        }
    }
}
