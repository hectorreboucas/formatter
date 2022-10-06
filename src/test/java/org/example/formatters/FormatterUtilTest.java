package org.example.formatters;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FormatterUtilTest {

    String text = "Test example";
    List<Word> result = FormatterUtil.getWordsList(text);

    @Test
    void shouldHaveTwoWords() {
        assertEquals(2, result.size());
    }

    @Test
    void shouldHaveSizeFourAndSix(){
        assertEquals(4, result.get(0).getLength());
        assertEquals(7, result.get(1).getLength());
    }

    @Test
    void firstWordShouldBe_0_4(){
        var word = result.get(0);
        assertEquals(0, word.getStartIndex());
        assertEquals(4, word.getEndIndex());
    }

    @Test
    void secondWordShouldBe_5_12(){
        var word = result.get(1);
        assertEquals(5, word.getStartIndex());
        assertEquals(12, word.getEndIndex());
    }
}