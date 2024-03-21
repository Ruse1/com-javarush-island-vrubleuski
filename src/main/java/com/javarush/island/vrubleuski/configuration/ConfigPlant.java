package com.javarush.island.vrubleuski.configuration;

public enum ConfigPlant {
    PLANT("🌿", 200, 1);
    private String image;
    private int countInLocation;
    private double weight;

    ConfigPlant(String image, int countInLocation, double weight) {
        this.image = image;
        this.countInLocation = countInLocation;
        this.weight = weight;
    }

    public String getImage() {
        return image;
    }

    public double getWeight() {
        return weight;
    }

    public int getCountInLocation() {
        return countInLocation;
    }
}
