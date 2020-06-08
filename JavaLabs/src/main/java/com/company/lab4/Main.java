package com.company.lab4;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Clothes ourCloses1 = new Clothes("red", 45, "cotton", "t-shirt", 1000);
        Clothes ourCloses2 = new Clothes("yellow", 50, "wool", "sweater", 200);
        Clothes ourCloses3 = new Clothes("blue", 55, "polyester", "sweatshirt", 500);

        Clothes[] clothesArray = {ourCloses1, ourCloses2, ourCloses3};

        System.out.println("\nСортування одягу за матеріалом у алфавітному порядку (у порядку зростання):");

        Arrays.sort(clothesArray, new ByMaterial());

        for (Clothes clothes : clothesArray) {
            System.out.println(clothes.getMaterial());
        }

        System.out.println("\nСортування одягу за ціною у спадаючому порядку");

        Arrays.sort(clothesArray, new ByPrice());

        for (Clothes clothes : clothesArray) {
            System.out.println(clothes.getPrice());
        }
    }
}
