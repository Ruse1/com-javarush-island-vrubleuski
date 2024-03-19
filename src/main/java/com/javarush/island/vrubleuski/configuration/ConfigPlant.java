package com.javarush.island.vrubleuski.configuration;

public enum ConfigPlant {
    PLANT("🌿",0.01);
    private String image;
    private double weight;

    ConfigPlant(String image, double weight) {
        this.image = image;
        this.weight = weight;
    }

    public String getImage() {
        return image;
    }

    public double getWeight() {
        return weight;
    }
}
