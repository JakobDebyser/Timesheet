package Timesheet;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WorkDay implements Day {
    private DayOfWeek hourlyrate;
    private LocalDate date;
    private Slot[] timeslots = new Slot[100];

    public WorkDay(LocalDate date) {
        setDate(date);
    }

    public WorkDay() {

    }

    public Slot[] getTimeslots() {
        return timeslots;
    }

    public void setTimeslots(Slot[] timeslots) {
        this.timeslots = timeslots;
    }

    public DayOfWeek getHourlyrate() {
        return hourlyrate;
    }

    public void setHourlyrate(DayOfWeek hourlyrate) {
        this.hourlyrate = hourlyrate;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public void removeSlot(Slot slot) {

    }

    @Override
    public void addSlot(Slot slot) {
        for (var i = 0; i < timeslots.length; i++) {
            if (timeslots[i] == null) {
                timeslots[i] = slot;
                i--;
            }
        }
    }

    @Override
    public long totalWorkedMinutes() {
        for (Slot el : timeslots) {
            if ((el != null)) {

            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
