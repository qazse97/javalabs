package com.company.lab5.entity;

import com.company.lab5.exception.CharacterPunctuationException;
/*Класс знаков пунктуации*/
public class PunctuationChar extends Char implements MemberOfSentence {

    private static final String PUNCT_CHAR = ".,!?-";

    public PunctuationChar(char character) {
        /*Вызов конструктора родителя с переданным символом, должен идти на первом месте в конструкторе наследника*/
        super(character);
        /* Проверка на то, является ли символ переданный в конструктор - знаком пунктуации
        * Если не является, то выбрасывается исключение CharacterPunctuationException*/
        if (!PUNCT_CHAR.contains(String.valueOf(character))) {
            throw new CharacterPunctuationException("This is not punctuation character: " + character);
        }
    }
}
