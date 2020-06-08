package com.company.lab4;

import java.util.Comparator;

public class ByPrice implements Comparator<Clothes> {
    public int compare(Clothes o1, Clothes o2) {
        return o1.getPrice() - o2.getPrice();
    }
}