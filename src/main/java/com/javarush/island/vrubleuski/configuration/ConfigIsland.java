package com.javarush.island.vrubleuski.configuration;

import com.javarush.island.vrubleuski.entity.animal.*;
import com.javarush.island.vrubleuski.entity.plant.Plant;

import java.util.HashMap;
import java.util.Map;

public class ConfigIsland {
    public static final int WIDTH = 100;
    public static final int HEIGHT = 20;
    public static final Map<Class<? extends Animal>, Map<Class<? extends Animal>, Integer>> SETTINGS_BEHAVIOR_ANIMALS_WITH_ANIMALS = new HashMap<>();
    public static final Map<Class<? extends Animal>, Map<Class<? extends Plant>, Integer>> SETTINGS_BEHAVIOR_ANIMALS_WITH_PLANTS = new HashMap<>();

    static {
        SETTINGS_BEHAVIOR_ANIMALS_WITH_ANIMALS.put(Wolf.class, new HashMap<Class<? extends Animal>, Integer>() {{
            put(Constrictor.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 10);
            put(Deer.class, 15);
            put(Rabbit.class, 60);
            put(Mouse.class, 80);
            put(Goat.class, 60);
            put(Sheep.class, 70);
            put(Boar.class, 15);
            put(Buffalo.class, 10);
            put(Duck.class, 40);
            put(Caterpillar.class, 0);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_ANIMALS.put(Constrictor.class, new HashMap<Class<? extends Animal>, Integer>() {{
            put(Wolf.class, 0);
            put(Fox.class, 15);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 20);
            put(Mouse.class, 40);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 10);
            put(Caterpillar.class, 0);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_ANIMALS.put(Fox.class, new HashMap<Class<? extends Animal>, Integer>() {{
            put(Wolf.class, 0);
            put(Constrictor.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 70);
            put(Mouse.class, 90);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 60);
            put(Caterpillar.class, 40);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_ANIMALS.put(Bear.class, new HashMap<Class<? extends Animal>, Integer>() {{
            put(Wolf.class, 0);
            put(Constrictor.class, 80);
            put(Fox.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 40);
            put(Deer.class, 80);
            put(Rabbit.class, 80);
            put(Mouse.class, 90);
            put(Goat.class, 70);
            put(Sheep.class, 70);
            put(Boar.class, 50);
            put(Buffalo.class, 20);
            put(Duck.class, 10);
            put(Caterpillar.class, 0);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_ANIMALS.put(Eagle.class, new HashMap<Class<? extends Animal>, Integer>() {{
            put(Wolf.class, 0);
            put(Constrictor.class, 0);
            put(Fox.class, 10);
            put(Bear.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 90);
            put(Mouse.class, 90);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 80);
            put(Caterpillar.class, 0);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_ANIMALS.put(Horse.class, new HashMap<Class<? extends Animal>, Integer>() {{
            put(Wolf.class, 0);
            put(Constrictor.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 0);
            put(Mouse.class, 0);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 0);
            put(Caterpillar.class, 0);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_ANIMALS.put(Deer.class, new HashMap<Class<? extends Animal>, Integer>() {{
            put(Wolf.class, 0);
            put(Constrictor.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Rabbit.class, 0);
            put(Mouse.class, 0);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 0);
            put(Caterpillar.class, 0);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_ANIMALS.put(Rabbit.class, new HashMap<Class<? extends Animal>, Integer>() {{
            put(Wolf.class, 0);
            put(Constrictor.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Mouse.class, 0);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 0);
            put(Caterpillar.class, 0);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_ANIMALS.put(Mouse.class, new HashMap<Class<? extends Animal>, Integer>() {{
            put(Wolf.class, 0);
            put(Constrictor.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 0);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 0);
            put(Caterpillar.class, 90);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_ANIMALS.put(Goat.class, new HashMap<Class<? extends Animal>, Integer>() {{
            put(Wolf.class, 0);
            put(Constrictor.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 0);
            put(Mouse.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 0);
            put(Caterpillar.class, 0);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_ANIMALS.put(Sheep.class, new HashMap<Class<? extends Animal>, Integer>() {{
            put(Wolf.class, 0);
            put(Constrictor.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 0);
            put(Mouse.class, 0);
            put(Goat.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 0);
            put(Caterpillar.class, 0);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_ANIMALS.put(Boar.class, new HashMap<Class<? extends Animal>, Integer>() {{
            put(Wolf.class, 0);
            put(Constrictor.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 0);
            put(Mouse.class, 50);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 0);
            put(Caterpillar.class, 90);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_ANIMALS.put(Buffalo.class, new HashMap<Class<? extends Animal>, Integer>() {{
            put(Wolf.class, 0);
            put(Constrictor.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 0);
            put(Mouse.class, 0);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Duck.class, 0);
            put(Caterpillar.class, 0);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_ANIMALS.put(Duck.class, new HashMap<Class<? extends Animal>, Integer>() {{
            put(Wolf.class, 0);
            put(Constrictor.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 0);
            put(Mouse.class, 0);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Caterpillar.class, 90);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_ANIMALS.put(Caterpillar.class, new HashMap<Class<? extends Animal>, Integer>() {{
            put(Wolf.class, 0);
            put(Constrictor.class, 0);
            put(Fox.class, 0);
            put(Bear.class, 0);
            put(Eagle.class, 0);
            put(Horse.class, 0);
            put(Deer.class, 0);
            put(Rabbit.class, 0);
            put(Mouse.class, 0);
            put(Goat.class, 0);
            put(Sheep.class, 0);
            put(Boar.class, 0);
            put(Buffalo.class, 0);
            put(Duck.class, 0);
        }});
    }

    static {
        SETTINGS_BEHAVIOR_ANIMALS_WITH_PLANTS.put(Horse.class, new HashMap<Class<? extends Plant>, Integer>() {{
            put(Plant.class, 100);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_PLANTS.put(Deer.class, new HashMap<Class<? extends Plant>, Integer>() {{
            put(Plant.class, 100);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_PLANTS.put(Rabbit.class, new HashMap<Class<? extends Plant>, Integer>() {{
            put(Plant.class, 100);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_PLANTS.put(Mouse.class, new HashMap<Class<? extends Plant>, Integer>() {{
            put(Plant.class, 100);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_PLANTS.put(Goat.class, new HashMap<Class<? extends Plant>, Integer>() {{
            put(Plant.class, 100);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_PLANTS.put(Sheep.class, new HashMap<Class<? extends Plant>, Integer>() {{
            put(Plant.class, 100);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_PLANTS.put(Boar.class, new HashMap<Class<? extends Plant>, Integer>() {{
            put(Plant.class, 100);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_PLANTS.put(Buffalo.class, new HashMap<Class<? extends Plant>, Integer>() {{
            put(Plant.class, 100);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_PLANTS.put(Duck.class, new HashMap<Class<? extends Plant>, Integer>() {{
            put(Plant.class, 100);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_PLANTS.put(Caterpillar.class, new HashMap<Class<? extends Plant>, Integer>() {{
            put(Plant.class, 100);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_PLANTS.put(Wolf.class, new HashMap<Class<? extends Plant>, Integer>() {{
            put(Plant.class, 0);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_PLANTS.put(Constrictor.class, new HashMap<Class<? extends Plant>, Integer>() {{
            put(Plant.class, 0);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_PLANTS.put(Fox.class, new HashMap<Class<? extends Plant>, Integer>() {{
            put(Plant.class, 0);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_PLANTS.put(Bear.class, new HashMap<Class<? extends Plant>, Integer>() {{
            put(Plant.class, 0);
        }});
        SETTINGS_BEHAVIOR_ANIMALS_WITH_PLANTS.put(Eagle.class, new HashMap<Class<? extends Plant>, Integer>() {{
            put(Plant.class, 0);
        }});
    }
}
