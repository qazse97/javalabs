package com.company.lab6;

public abstract class Flower {
    protected double length;
    protected int freshness;
    protected double price;

    public Flower(double length, int freshness, double price) {
        this.length = length;
        this.freshness = freshness;
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower: " + this.getClass().getSimpleName() + " {" +
                "length=" + length +
                ", freshness=" + freshness +
                ", price=" + price +
                '}';
    }
}
