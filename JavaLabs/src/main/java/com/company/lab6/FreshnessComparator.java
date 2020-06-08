package com.company.lab6;

import java.util.Comparator;
/*Компаратор для сравнения цветов по проценту свежести*/
public class FreshnessComparator implements Comparator<Flower> {
    @Override
    public int compare(Flower o1, Flower o2) {
        return o1.freshness - o2.freshness;
    }
}
