package Timesheet;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

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
    public void addTimeslot(LocalTime from, LocalTime until) {
        new TimeSlot(from,until);
    }

    @Override
    public void addBreakSlot(LocalTime from, LocalTime until) {

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
