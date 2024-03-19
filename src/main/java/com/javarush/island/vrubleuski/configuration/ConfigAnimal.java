package com.javarush.island.vrubleuski.configuration;

public enum ConfigAnimal {
    WOLF("🐺", 30, 50, 3, 8),
    CONSTRICTOR("🐍", 30, 15, 1, 3),
    FOX("🦊", 30, 8, 2, 2),
    BEAR("🐻", 5, 500, 2, 80),
    EAGLE("🦅", 20, 6, 3, 1),
    HORSE("🐎", 20, 400, 4, 60),
    DEER("🦌", 20, 300, 4, 50),
    RABBIT("🐇", 150, 2, 2, 0.45),
    MOUSE("🐁", 500, 0.05, 1, 0.45),
    GOAT("🐐", 140, 60, 3, 10),
    SHEEP("🐑", 140, 70, 3, 15),
    BOAR("🐗", 50, 400, 2, 50),
    BUFFALO("🐃", 10, 700, 3, 100),
    DUCK("🦆", 200, 1, 4, 0.15),
    CATERPILLAR("🐛", 1000, 0.01, 0, 0);
    private String image;
    private int countInLocation;
    private double weight;
    private int speed;
    private double fullSaturation;

    ConfigAnimal(String image, int countInLocation, double weight, int speed, double fullSaturation) {
        this.image = image;
        this.countInLocation = countInLocation;
        this.weight = weight;
        this.speed = speed;
        this.fullSaturation = fullSaturation;
    }
    public String getImage() {
        return image;
    }
    public double getWeight() {
        return weight;
    }
    public int getSpeed() {
        return speed;
    }
    public double getFullSaturation() {
        return fullSaturation;
    }
    public int getCountInLocation() {
        return countInLocation;
    }
}
