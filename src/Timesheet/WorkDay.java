package Timesheet;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class WorkDay implements Day {
    private final Slot[] slots = new Slot[100];
    private double hourlyrate;
    private LocalDate date;
    private int size;

    public WorkDay(LocalDate date) {
        setDate(date);
    }

    @Override
    public Slot[] getSlots() {
        return slots;
    }

    @Override
    public double getHourlyrate() {
        return hourlyrate;
    }

    @Override
    public void setHourlyrate(DayOfWeek day, LocalTime time) {
        if (day.getValue() < 5) {
            if (time.getHour() > 8 && time.getHour() < 18) {
                hourlyrate = Rates.MON.normalHourlyRate;
            } else {
                hourlyrate = Rates.MON.overtimeHourlyRate;
            }
        } else if (day.getValue() == Rates.SAT.ordinal()) {
            hourlyrate = Rates.SAT.normalHourlyRate;
        } else {
            hourlyrate = Rates.SUN.normalHourlyRate;
        }

    }


    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public void removeSlot(Slot slot) {
        for (var i = 0; i < slots.length; i++) {
            if (slots[i].equals(slot)) {
                slots[i] = null;
            }
        }
    }


    @Override
    public void addTimeslot(LocalTime from, LocalTime until) {
        slots[getFreeLocation()] = new TimeSlot(from, until);
        size++;

    }

    @Override
    public void addBreakSlot(LocalTime from, LocalTime until) {
        slots[getFreeLocation()] = new BreakSlot(from, until);
        size++;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    @Override
    public double totalWorkedMinutes() {
        double sum = 0;
        for (Slot slot : slots) {

            sum += slot.getTotalMinutes();

        }

        return sum;
    }


    private int getFreeLocation() {

        for (var i = 0; i < slots.length; i++) {
            if (slots[i] == null) {
                return i;

            }
        }
        return -1;

    }

    @Override
    public String toString() {
        return getDate().toString();
    }
}
