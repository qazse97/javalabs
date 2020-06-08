package com.company.lab5.entity;

import java.util.ArrayList;
import java.util.List;

/*Класс строки, содержащий массив слов Word и знаков пунктуации PunctuationChar,
 в массив MemberOfSentence - это возможно благодаря полиморфизму, так как Word и PunctuationChar оба реализуют интерфейс
  MemberOfSentence*/
public class Line {
    private final MemberOfSentence[] membersOfSentences;

    public Line(MemberOfSentence... membersOfSentences) {
        this.membersOfSentences = membersOfSentences;
    }

    public Line(List<MemberOfSentence> memberOfSentences) {
        this.membersOfSentences = memberOfSentences.toArray(new MemberOfSentence[memberOfSentences.size()]);
    }

    public static Line getLineFromString(String line) {
        String[] words = line.split("\\s+"); //Делим String на слова через регулярные выражения по пробелам
        List<MemberOfSentence> tempArray = new ArrayList<>();
        PunctuationChar tempPunctuationChar = null;

        for (int i = 0; i < words.length; i++) {
            /*Если в слове в конце стоит знак пунктуации, то мы записываем его во временную переменную tempPunctuationChar */
            if (",.?!-".contains(String.valueOf(words[i].toCharArray()[words[i].length() - 1]))) {
                tempPunctuationChar = new PunctuationChar(words[i].charAt(words[i].length() - 1));
            }
            /*Если времення переменная tempPunctuationChar не null(существует), то во временную переменную tempWord
              записываем слово без знака, а затем добавляем это слово во временный список типа List tempArray,
              Если времення переменная tempPunctuationChar, то есть знака пунктуации в конце слова нет,
              то просто записываем слово в во временный список типа List tempArray*/
            if (tempPunctuationChar != null) {
                String tempWord = words[i].substring(0, words[i].length() - 1);
                tempArray.add(Word.getWordFromChars(tempWord.toCharArray()));
            } else {
                tempArray.add(Word.getWordFromChars(words[i].toCharArray()));
            }
            /*Если знак пунктуации не null, то записываем его после нужного слова во временный список tempArray*/
            if (tempPunctuationChar != null) {
                tempArray.add(tempPunctuationChar);
                tempPunctuationChar = null;
            }
        }
        /*Возвращаем новую строку из нашего временного списка tempArray*/
        return new Line(tempArray);
    }

    public MemberOfSentence[] getMembersOfSentences() {
        return membersOfSentences;
    }

    @Override
    public String toString() {
        /*Собираем строку для вывода в System.out.printLn()*/
        StringBuilder sb = new StringBuilder();
        for (MemberOfSentence membersOfSentence : membersOfSentences) {
            sb.append(membersOfSentence);
        }
        sb.append("\n");
        /*Заменяем через регулярные выражения все пробелы перед знаками пунктуации, что бы выглядело красиво и возвращаем*/
        return sb.toString().replaceAll("\\s+(?=\\p{Punct})", "");
    }
}
