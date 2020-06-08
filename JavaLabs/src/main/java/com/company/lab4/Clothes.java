package com.company.lab4;

public class Clothes {
    private String color;
    private int size;
    private String material;
    private String typeOfClothes;
    private int price;

    public Clothes(String color, int size, String material, String typeOfClothes, int price) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.typeOfClothes = typeOfClothes;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTypeOfClothes() {
        return typeOfClothes;
    }

    public void setTypeOfClothes(String typeOfClothes) {
        this.typeOfClothes = typeOfClothes;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

