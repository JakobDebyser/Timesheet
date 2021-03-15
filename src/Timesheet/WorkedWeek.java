package Timesheet;

import java.time.LocalDate;

public class WorkedWeek extends WorkedDay implements Week {
    public WorkedWeek(LocalDate date) {
        super(date);
    }

    @Override
    public void removeSlot(Slot slot) {

    }

    @Override
    public void addSlot(Slot slot) {

    }
}
