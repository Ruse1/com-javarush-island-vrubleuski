package com.javarush.island.vrubleuski.entity.plant;

import com.javarush.island.vrubleuski.configuration.ConfigPlant;
import com.javarush.island.vrubleuski.entity.animal.Eatable;
import com.javarush.island.vrubleuski.entity.area.Location;

public class Plant implements Eatable {
    private Location location;
    private final ConfigPlant plant;

    public Plant(Location location) {
        this.location = location;
        this.plant = ConfigPlant.PLANT;
    }
}
