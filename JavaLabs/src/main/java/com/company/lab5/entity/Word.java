package com.company.lab5.entity;

public class Word implements MemberOfSentence {
    private final Char[] charsInWord;

    public Word(Char... chars) {
        this.charsInWord = chars;
    }

    public static Word getWordFromChars(char[] chars) {
        /*Временный массив объектов Char*/
        Char[] temp = new Char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            /*Копируем из массива примитивов char в наш массив объектов Char*/
            temp[i] = new Char(chars[i]);
        }
        return new Word(temp);
    }

    @Override
    public String toString() {
        /*Собираем строку для вывода в System.out.printLn()*/
        StringBuilder sb = new StringBuilder();
        for (Char character : charsInWord) {
            sb.append(character);
        }
        sb.append(" ");
        return sb.toString();

    }
}
