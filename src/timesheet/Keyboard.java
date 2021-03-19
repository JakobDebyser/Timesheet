package timesheet;



import java.time.LocalDate;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Keyboard {
    static Scanner keyboard = new Scanner(System.in);

    public static String askForTimeslot(String text) {
        System.out.println(text);
        System.out.println("choose between timeslot or breakslot");
        return keyboard.next();

    }

    public static int askForNumber(String text) {

        System.out.println(text);
        return keyboard.nextInt();
    }

    public static LocalDate askForDate(String text) {
        System.out.println(text);
        System.out.println("example date: dd/mm/yyyy ");
        Scanner keyboard = new Scanner(System.in);
        String date = keyboard.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(date,formatter);
    }

    public static LocalTime askForTime(String text) {
        System.out.println(text);
        System.out.println("enter time as follow: hh:mm");
        Scanner keyboard = new Scanner(System.in);
        String starttime = keyboard.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return LocalTime.parse(starttime,formatter);
    }

    public static int askForNewMoment(String text) {
        System.out.println(text);
        System.out.println("days are numbered between 0-6");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.next();
        return Integer.parseInt(input);
    }
}
