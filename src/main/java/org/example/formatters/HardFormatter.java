package org.example.formatters;

public class HardFormatter implements IFormatter {
    @Override
    public String format(String text, int limit) {
        int index = limit;
        var newText = text.substring(0, limit <= text.length() ? limit : text.length());

        while(index < text.length()) {
            newText += "\n" + text.substring(index, (index + limit) <= text.length() ? index + limit : text.length());
            index += limit;
        }
        return newText;
    }
}
