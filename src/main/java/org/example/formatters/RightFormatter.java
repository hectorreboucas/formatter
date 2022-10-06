package org.example.formatters;

public class RightFormatter extends AbstractFormatter {

    protected String formatLine(String line, int limit){
        int totalSpaces = limit - line.length();
        String newLine = " ".repeat(totalSpaces) + line;
        return newLine;
    }
}
