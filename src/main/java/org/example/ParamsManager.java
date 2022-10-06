package org.example;

import org.example.formatters.Formatters;

public class ParamsManager {
    String args[];
    public ParamsManager(String args[]){
        this.args = args;
    }

    public Formatters getFormatter() throws Exception {
        try{
            return Formatters.valueOf(this.args[0]);
        }catch(Exception e){
            throw new Exception("First param should be an algorithm center|left|right|hard");
        }
    }

    public int getLimit() throws Exception {
        try{
            return Integer.valueOf(this.args[1]);

        }catch(Exception e){
            throw new Exception("Second params should be a limit (number) over 0");
        }
    }

    public static void validateInput(String text, int limit) throws Exception{
        var words = text.split(" ");
        for(var word: words){
            if(word.length() > limit){
                throw new Exception("Your biggest word should be shorter than your limit");
            }
        }
    }
}
