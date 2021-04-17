package com.company;

public class Plant {
    boolean needsWatering;
    String plantFamily;
    String Name;

    public Plant(String Name, boolean needsWatering, String plantFamily) {

        this.Name = Name;
        this.needsWatering = true;
        this.plantFamily = plantFamily;
    }

    public void wateringinstructions() {
        System.out.println("Water your plant once a week");

    }

    public void sunlight() {
        System.out.println("This plant needs direct exposure to sunlight");
    }
}

