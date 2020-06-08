package com.company.lab5.entity;
/*Класс текста, содержит в себе массив строк */
public class Text {
    private final Line[] lines;

    public Text(Line... lines) {
        this.lines = lines;
    }

    public Line[] getLines() {
        return lines;
    }

    @Override
    public String toString() {
        /*Собираем строку для вывода в System.out.printLn()*/
        StringBuilder sb = new StringBuilder();
        for (Line line : lines) {
            sb.append(line);
        }
        return sb.toString();
    }
}
