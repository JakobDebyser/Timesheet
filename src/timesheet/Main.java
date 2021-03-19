package timesheet;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Main {
    final static String TIMESLOT = "timeslot";
    final static String BREAKSLOT = "breakslot";

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
        Week workWeek = null;

        boolean runApp = true;
        while (runApp) {
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
                if (workWeek == null) {
                    System.out.println("there is not yet a workweek created");

                } else {

                    int start_Moment = Keyboard.askForNewMoment("on which day of your week do you want to add a new slot?");

                    String typeOfSlot = Keyboard.askForTimeslot("What type of moment do you want to add?");

                    LocalTime from = Keyboard.askForTime("start time");

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");
                    System.out.println("starttime is " + from.format(formatter));

                    LocalTime until = Keyboard.askForTime("end time");
                    System.out.println("endtime is " + until.format(formatter));
                    if (typeOfSlot.equals(TIMESLOT)) {

                        Day day = workWeek.getDay(start_Moment);// van die week zeg welke dag het is met start_moment
                        day.addTimeslot(from, until);// maak een timeslot aan met beginuur from en einduur until
                    } else if (typeOfSlot.equals(BREAKSLOT)) {


                        Day day = workWeek.getDay(start_Moment);
                        day.addBreakSlot(from, until);

                    }
                }

            } else if (input == 4) {

            } else if (input == 5) {

            } else if (input == 6) {
                if (workWeek == null) {
                    System.out.println("there is not yet a workweek created");

                } else {
                    for (var i = 0; i <= 6; i++) {
                        for (var j = 0; j <= workWeek.getDay(i).getSizeOfslots(); j++) {
                            Day day = workWeek.getDay(i);
                            Slot slot = workWeek.getDay(i).getSlots()[j];
                            day.setHourlyrate(day, slot.getStart(), slot.getEnd());
                            double result = day.getHourlyrate() * slot.getTotalMinutes();

                        }
                    }
                }


            } else if (input == 7) {

            } else if (input == 8) {
                runApp = false;
            }

        }
        System.out.println("Thank you for using the app");
        System.out.println("See you soon");

    }


}
