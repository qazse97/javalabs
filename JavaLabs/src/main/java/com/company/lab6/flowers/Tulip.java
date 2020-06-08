package com.company.lab6.flowers;

import com.company.lab6.Flower;

public class Tulip extends Flower {
    private int numberOfPetals;

    public Tulip(double length, int freshness, double price, int numberOfPetals) {
        super(length, freshness, price);
        this.numberOfPetals = numberOfPetals;
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    public void setNumberOfPetals(int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }
}
