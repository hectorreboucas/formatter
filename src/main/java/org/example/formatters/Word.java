package org.example.formatters;

public class Word {
    int startIndex;
    int endIndex;
    int length;

    public Word(int startIndex, int endIndex){
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.length = endIndex - startIndex;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public int getLength() {
        return length;
    }

    public String getStringWord(String text){
        return text.substring(this.startIndex, this.endIndex);
    }
}
