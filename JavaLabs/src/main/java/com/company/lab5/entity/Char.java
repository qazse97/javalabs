package com.company.lab5.entity;
/*Минимальная часть - символ*/
public class Char {
    private final char character;

    public Char(char character) {
        this.character = character;
    }


    @Override
    public String toString() {
        return String.valueOf(this.character);
    }
}
