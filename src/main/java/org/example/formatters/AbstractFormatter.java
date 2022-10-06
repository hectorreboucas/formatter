package org.example.formatters;

public abstract class AbstractFormatter implements IFormatter {

    @Override
    public String format(String text, int limit) {
        String newText = "";
        var wordList = FormatterUtil.getWordsList(text);

        String line = "";

        for(var word: wordList){
            if(line.length() + word.getLength() < limit){
                line += (line.length() != 0 ? " " : "") + word.getStringWord(text);
            }else{
                newText += (newText.isEmpty() ? "" : "\n") + formatLine(line, limit);
                line = word.getStringWord(text);
            }
        }
        newText += (newText.isEmpty() ? "" : "\n") + formatLine(line, limit);
        return newText;
    }

    protected abstract String formatLine(String line, int limit);
}
