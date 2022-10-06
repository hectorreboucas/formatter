package org.example;

import org.example.formatters.FormatterFactory;
import org.example.formatters.IFormatter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        var paramsManager = new ParamsManager(args);
        var formatterName = paramsManager.getFormatter();
        var limit = paramsManager.getLimit();

        IFormatter formatter = FormatterFactory.getFormatter(formatterName);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("You have chosen algorithm: "+ formatterName +" with limit:" + limit);

        while(true){
            System.out.println("\nWrite your text or type 'exit' to finish the program:\n");
            String input = reader.readLine();

            if(input.equals("exit")){
                return;
            }

            try {
                ParamsManager.validateInput(input, limit);
            }catch(Exception e){
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println("\nFormatted Text:");
            System.out.println(formatter.format(input, limit));
        }
    }
}