package com.company.lab5;

import com.company.lab5.entity.ByLengthComparator;
import com.company.lab5.entity.Char;
import com.company.lab5.entity.Line;
import com.company.lab5.entity.PunctuationChar;
import com.company.lab5.entity.Text;
import com.company.lab5.entity.Word;

import java.util.Arrays;
/*с3 = 2, c17 = 1*/
public class Main {
    public static void main(String[] args) {
        System.out.println("String version of sentences");
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
        System.out.println();
        lab5();
    }

    public static void lab5() {
        System.out.println("Class version of sentences");
        /*Инициализация объекта Word через объекты Char*/
        Word hello = new Word(new Char('H'),
                new Char('e'),
                new Char('l'),
                new Char('l'),
                new Char('o'));
        /*Инициализация знаков пунктуации*/
        PunctuationChar comma = new PunctuationChar(',');
        PunctuationChar exclamationMark = new PunctuationChar('!');

        /*Инициализация объекта Word через статический метод из строки String*/
        Word world = Word.getWordFromChars("World".toCharArray());

        /*Строка из слова Word */
        Line helloWorld = new Line(hello);

        /*Строка из двух объектов - слова Word и восклицательного знака PunctuationChar*/
        Line worldLine = new Line(world, exclamationMark);

        /*Строки через статический метод класса Line из строки для большего удобства*/
        Line aa = Line.getLineFromString("aa");
        Line andHowDoYouDo = Line.getLineFromString("And how do you do?");
        Line andHowDoYouDoandHowDoYouDo = Line.getLineFromString("And how do you do? And how do you do?");

        /*Объект текста Text из объектов Line (строк), можно задавать n-ным количеством строк через запятую*/
        Text text = new Text(helloWorld, worldLine, aa, andHowDoYouDo, andHowDoYouDoandHowDoYouDo);

        /*Сортировка массива строк (Line) в объекте текста (Text) статическим методом класса Arrays через отдельный компаратор,
        * который описан в классе ByLengthComparator, сравнивая по количеству слов в Line */
        Arrays.sort(text.getLines(), new ByLengthComparator());

        /*Вывод объекта текста через неявный вызов метода toString() класса Text*/
        System.out.println(text);

    }
}
