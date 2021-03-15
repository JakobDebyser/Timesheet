package Timesheet;

import Timesheet.Keyboard;

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
        TimesheetService service = new TimesheetServiceImpl();
        var runApp = false;
        while (!runApp) {
            int input = Keyboard.askForNumber(Keyboard.keyboard.next());
            System.out.println("Your choice is " + input);
            if (input == 1) {
                for (Rates el:Rates.values()) {
                    Rates.printRates(el);
                }

            } else if (input == 2) {
                Week week = service.createWeek();
            } else if (input == 3) {


            } else if (input == 4) {

            } else if (input == 5) {

            } else if (input == 6) {

            } else if (input == 7) {

            }else if (input == 8){
               runApp = true;
            }

        }
        System.out.println("Thank you for using the app");
        System.out.println("See you soon");

    }


}
