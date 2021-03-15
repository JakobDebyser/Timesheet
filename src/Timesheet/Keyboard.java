package Timesheet;

import java.util.Scanner;

public class Keyboard {
    static Scanner keyboard = new Scanner(System.in);

    public static String askForText(String text){
        System.out.println();
        return text;
    }
    public static int askForNumber(String text){
        String number = "";
        if (!text.contains("[a-zA-Z]+") && text.length() >=1) number = text;
        else{
            System.out.println("Enter only a number");
            Keyboard.keyboard.next();
        }

        return Integer.parseInt(number);
    }
    public static double askForDouble(String text){
        return Double.parseDouble(text);
    }
}
