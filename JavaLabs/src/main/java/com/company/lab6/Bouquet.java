package com.company.lab6;

import java.util.List;

public class Bouquet {
    private List<Flower> flowers;
    private List<Accessory> accessories;
    private double price;

    public Bouquet() {
        this.price = 0;
    }

    public Bouquet(List<Flower> flowers, List<Accessory> accessories) {
        this.flowers = flowers;
        this.accessories = accessories;
        this.price = 0;
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }

    public void removeFlower(Flower flower) {
        flowers.remove(flower);
    }

    public void removeAccessory(Accessory accessory) {
        accessories.remove(accessory);
    }

    public double calculatePriceOfBouquet() {
        for (Flower flower : flowers) {
            price += flower.getPrice();
        }
        for (Accessory accessory : accessories) {
            price += accessory.getPrice();
        }
        return this.price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void sortFlowersByFreshness() {
        flowers.sort(new FreshnessComparator());
    }

    public Flower findByFlowerLength(double min, double max) {
        for (Flower flower : flowers) {
            double flowerLength = flower.getLength();
            if (flowerLength >= min && flowerLength <= max) {
                return flower;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bouquet(" +
                "flowers: " + flowers +
                ", accessories: " + accessories +
                ", price: " + price +
                ')';
    }

    public List<Flower> getFlowers() {
        return flowers;
    }
}
