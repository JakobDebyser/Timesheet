package Timesheet;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WorkedDay implements Day {
    DayOfWeek hourlyrate = null;
    LocalDate date = LocalDate.now();
    Slot[] timeslots = new Slot[100];

    public WorkedDay(LocalDate date) {

    }

    @Override
    public void removeSlot(Slot slot) {

    }

    @Override
    public void addSlot(Slot slot) {
        for (var i = 0; i < timeslots.length; i++) {
            if(timeslots[i]==null){
                timeslots[i]=slot;
                i--;
            }
        }
    }

    @Override
    public long totalWorkedMinutes() {
        for (Slot el:timeslots) {
            if ((el!=null)){

            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
