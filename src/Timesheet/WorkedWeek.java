package Timesheet;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WorkedWeek extends WorkedDay implements Week {
    public WorkedWeek(LocalDate date) {
        super(date);
    }

    public WorkedWeek() {
        super();
    }

    @Override
    public void removeSlot(Slot slot) {

    }

    @Override
    public void addSlot(Slot slot) {

    }

    @Override
    public WorkedDay createStartday() {
        System.out.println("Give in which day of the week you want to start your week:");
        int input = Keyboard.askForNumber(Keyboard.keyboard.next());
        DayOfWeek startday = DayOfWeek.valueOf(String.valueOf(input));
        System.out.println("you start on a "+startday.name());
        return null;
    }
}
