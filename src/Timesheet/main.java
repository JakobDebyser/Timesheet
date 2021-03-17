package Timesheet;

import java.time.DayOfWeek;
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

        boolean runApp = true;
        while (runApp) {
            Week workWeek=null;
            int input = Keyboard.askForNumber("Make your choice");
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
                workWeek = new WorkWeek(start);



            } else if (input == 3) {
                if (workWeek ==  null)throw new NullPointerException("you have not made a new workweek");

                int start_Moment = Keyboard.askForNewMoment("on which day of your week do you want to add a new slot?");

                String typeOfSlot = Keyboard.askForTimeslot("What type of moment do you want to add?");

                LocalTime from = Keyboard.askForTime("start time");

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
                System.out.println("starttime is " + from.format(formatter));

                LocalTime until = Keyboard.askForTime("end time");
                System.out.println("endtime is " + until.format(formatter));
                if (typeOfSlot.equals("timeslot")) {
                    Day day = workWeek.getDay(start_Moment);// van die week zeg welke dag het is met start_moment
                    day.addTimeslot(from, until);// maak een timeslot aan met beginuur from en einduur until
                } else if(typeOfSlot.equals("breakslot")) {
                    Day day = workWeek.getDay(start_Moment);
                    day.addBreakSlot(from,until);

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
