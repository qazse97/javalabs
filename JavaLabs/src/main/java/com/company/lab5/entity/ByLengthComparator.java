package com.company.lab5.entity;

import java.util.Comparator;
/*Компаратор для сравнения строк по количеству слов*/
public class ByLengthComparator implements Comparator<Line> {
    @Override
    public int compare(Line o1, Line o2) {
        return o1.getMembersOfSentences().length - o2.getMembersOfSentences().length;
    }
}
