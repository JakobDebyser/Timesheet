package Timesheet;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class main {
    public static void main(String[] args) {
        System.out.println("What do you want to do?");
        System.out.println("type in the number that corresponds with your choice:");
        System.out.println("1. Show the different hourly rates");
        System.out.println("2. Start a new workweek");
        System.out.println("3. Add a worked moment or break");
        System.out.println("4. Remove a worked moment or break");
        System.out.println("5. Reset");
        System.out.println("6. Print Paycheck");
        System.out.println("7. Print detailed Paycheck");
        System.out.println("8. Quit application");

        var runApp = true;
        while (runApp) {
            int input = Keyboard.askForNumber("Maak uw keuze");
            System.out.println("Your choice is " + input);
            if (input == 1) {
                for (Rates el : Rates.values()) {
                    Rates.printRates(el);
                }

            } else if (input == 2) {
                LocalDate start = Keyboard.askForDate("When do you start your week?");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                System.out.println("Your workweek start at " + start.format(formatter));
                System.out.println("you start at a " + start.getDayOfWeek());
                Week week = new WorkWeek(start);


            } else if (input == 3) {
                int start_Moment = Keyboard.askForNewMoment("on which day of your week do you want to add a new slot?");

                String typeOfSlot = Keyboard.askForTimeslot("What type of moment do you want to add?");
                LocalTime from = Keyboard.askForTime("start time");

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
                System.out.println("starttime is " + from.format(formatter));
                //int from = Keyboard.askForNumber("Start tijd:");
                int until = Keyboard.askForNumber("end time");
                //int until = Keyboard.askForNumber("Eind tijd:");
                if (typeOfSlot.equals("timeslot")) {
                    //Week week = getWeek();
                    //Day day = week.getDay(startMoment)
                    //day.addTimeSlot(from, until);
                } else {
                    //Week week = getWeek();
                    //Day day = week.getDay(startMoment)
                    //day.addBreakSlot(from, until);
                }

            } else if (input == 4) {

            } else if (input == 5) {

            } else if (input == 6) {

            } else if (input == 7) {

            } else if (input == 8) {
                runApp = false;
            }

        }
        System.out.println("Thank you for using the app");
        System.out.println("See you soon");

    }


}
