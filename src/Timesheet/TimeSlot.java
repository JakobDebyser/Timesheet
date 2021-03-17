package Timesheet;

import java.time.Duration;
import java.time.LocalTime;

import java.time.format.DateTimeFormatter;

public class TimeSlot implements Slot {
    private String description = "TimeSlot";
    private long totalMinutes;
    private LocalTime start;
    private LocalTime end;

    public TimeSlot(LocalTime start, LocalTime end) {
        setStart(start);
        setEnd(end);
        setTotalMinutes(getStart(), getEnd());

    }


    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public long getTotalMinutes() {
        return totalMinutes;
    }

    public void setTotalMinutes(LocalTime startminute, LocalTime endmin) {
        totalMinutes = endmin.getMinute() - startminute.getMinute();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void printSlotInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(formatter.format(start));
        System.out.println(formatter.format(end));
    }
}
