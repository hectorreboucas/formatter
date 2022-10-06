package org.example.formatters;

public class FormatterFactory {
    public static IFormatter getFormatter(Formatters formatterName) {
        switch(formatterName){
            case center: return new CenterFormatter();
            case right: return new RightFormatter();
            case hard: return new HardFormatter();
            default: return new LeftFormatter();
        }
    }
}
