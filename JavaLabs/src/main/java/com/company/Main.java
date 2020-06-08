package com.company;

import com.company.lab6.Flower;
import com.company.lab6.flowers.Marigold;
import com.company.lab6.flowers.Rose;
import com.company.lab6.flowers.Tulip;
import com.company.lab7.LinkedSet;

import java.util.Iterator;

/*c2 = 1, c3 = 2*/
public class Main {
    public static void main(String[] args) {
        /*Создаём объект нашей коллекции, типизируем её классом - Flower*/
        LinkedSet<Flower> linkedSet = new LinkedSet<>();
        /*Создаём объекты цветов*/
        Flower rose = new Rose(25, 100, 50.50, true);
        Flower marigold = new Marigold(35, 90, 120.50, true);
        Flower tulip = new Tulip(15, 50, 40.50, 12);

        /*Добавляем объекты цветов в нашу коллекцию*/
        linkedSet.add(rose);
        linkedSet.add(marigold);
        linkedSet.add(tulip);
        linkedSet.add(rose);

        System.out.println("Iterator");
        Iterator<Flower> iterator = linkedSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("ListIterator");
        LinkedSet<Flower>.ListIterator listIterator = linkedSet.listIterator();
        /* При удаление элемента после создания ListIterator, выбрасывает ConcurrentModificationException, потому что
         * коллекция основана на LinkedList (Что в свою очередь - двусвязный список), а он fail-fast - не потокобезопасный
         * поэтому модификация коллекции запрещена после создания итератора */

        //linkedSet.remove(rose);

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
