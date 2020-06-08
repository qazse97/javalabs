package com.company.lab6.flowers;

import com.company.lab6.Flower;

public class Rose extends Flower {
    private boolean spikes;

    public Rose(double length, int freshness, double price, boolean spikes) {
        super(length, freshness, price);
        this.spikes = spikes;
    }

    public boolean isSpikes() {
        return spikes;
    }

    public void setSpikes(boolean spikes) {
        this.spikes = spikes;
    }
}
