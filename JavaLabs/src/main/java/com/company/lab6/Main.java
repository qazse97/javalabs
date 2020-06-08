package com.company.lab6;

import com.company.lab6.flowers.Marigold;
import com.company.lab6.flowers.Rose;
import com.company.lab6.flowers.Tulip;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/*c13 = 0*/
public class Main {
    public static void main(String[] args) {
        Flower rose = new Rose(25, 100, 50.50, true);
        Flower marigold = new Marigold(35, 90, 120.50, true);
        Flower tulip = new Tulip(15, 50, 40.50, 12);

        Accessory accessory = new Accessory("Line", 10.0);
        List<Flower> flowerList = new LinkedList<>();

        flowerList.add(rose);
        flowerList.add(marigold);
        flowerList.add(tulip);

        Bouquet bouquet = new Bouquet(flowerList, Collections.singletonList(accessory));
        System.out.println(bouquet.calculatePriceOfBouquet());

        bouquet.sortFlowersByFreshness();
        System.out.println(bouquet.getFlowers());
    }
}
