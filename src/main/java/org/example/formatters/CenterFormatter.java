package org.example.formatters;

public class CenterFormatter extends AbstractFormatter {
    protected String formatLine(String line, int limit){
        int totalSpaces = limit - line.length();
        int spaces = totalSpaces / 2;
        boolean isEven = totalSpaces % 2 == 0;
        String newLine = " ".repeat(isEven ? spaces : spaces + 1) + line + " ".repeat(spaces);
        return newLine;
    }
}
