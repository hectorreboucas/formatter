package org.example.formatters;

import java.util.LinkedList;
import java.util.List;

public class FormatterUtil {

    public static List<Word> getWordsList(String text){
        var list = new LinkedList<Word>();
        int startIndex = 0;
        int endIndex = 0;
        while(endIndex < text.length()){
            while(startIndex < text.length() && text.charAt(startIndex) == ' ')
                startIndex++;
            endIndex = startIndex + 1;
            while(endIndex < text.length() && text.charAt(endIndex) != ' ')
                endIndex++;
            list.add(new Word(startIndex, endIndex));
            startIndex = endIndex;
            endIndex++;
        }
        return list;
    }
}
