package com.javarush.island.vrubleuski.configuration;

public enum ConfigAnimal {
    WOLF("🐺", 50, 3, 8),
    CONSTRICTOR("🐍", 15, 1, 3),
    FOX("🦊", 8,2,2),
    BEAR("🐻",500,2,80),
    EAGLE("🦅",6,3,1),
    HORSE("🐎",400,4,60),
    DEER("🦌",300,4,50),
    RABBIT("🐇",2,2,0.45),
    MOUSE("🐁",0.05,1,0.45),
    GOAT("🐐",60,3,10),
    SHEEP("🐑",70,3,15),
    BOAR("🐗",400,2,50),
    BUFFALO("🐃",700,3,100),
    DUCK("🦆",1,4,0.15),
    CATERPILLAR("🐛",0.01,0,0);

    private String image;
    private double weight;
    private int speed;
    private double fullSaturation;

    ConfigAnimal(String image, double weight, int speed, double fullSaturation) {
        this.image = image;
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
}
