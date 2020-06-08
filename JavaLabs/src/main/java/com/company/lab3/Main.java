package com.company.lab3;

public class Main {

    public static void main(String[] args) {

        String[] strArray = {"World!", "Hello", "And how do you do?", "aa", "And how do you do?And how do you do?"};
        String tempString;

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length - 1 - i; j++) {
                if (strArray[j].length() > strArray[j + 1].length()) {
                    tempString = strArray[j];
                    strArray[j] = strArray[j + 1];
                    strArray[j + 1] = tempString;
                }
            }
        }

        for (String s : strArray) {
            System.out.println(s);
        }
    }
}
