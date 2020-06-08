package com.company.lab6.flowers;

import com.company.lab6.Flower;

public class Marigold extends Flower {
    private boolean hasRedCenter;

    public Marigold(double length, int freshness, double price, boolean hasRedCenter) {
        super(length, freshness, price);
        this.hasRedCenter = hasRedCenter;
    }

    public boolean isHasRedCenter() {
        return hasRedCenter;
    }

    public void setHasRedCenter(boolean hasRedCenter) {
        this.hasRedCenter = hasRedCenter;
    }
}
