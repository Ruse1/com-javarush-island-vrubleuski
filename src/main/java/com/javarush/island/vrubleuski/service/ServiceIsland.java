package com.javarush.island.vrubleuski.service;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ServiceIsland {
    private static ThreadLocalRandom random = ThreadLocalRandom.current();

    public static int randomIntFromTo(int from, int to) {
        return random.nextInt(from, to);
    }

    public static int randomInt(int bound) {
        return random.nextInt(bound);
    }

    public static <T> void removeNull(List<T> list) {
        list.removeAll(Collections.singleton(null));
    }


}
