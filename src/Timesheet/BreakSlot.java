package Timesheet;

import java.time.LocalTime;

public class BreakSlot implements Slot {
    private String description = "BreakSlot";
    private LocalTime start = null;
    private LocalTime end = null;
    private long totalMinutes;

    public BreakSlot(LocalTime start, LocalTime end) {
        setStart(start);
        setEnd(end);
        setTotalMinutes(start,end);

    }

    public double getTotalMinutes() {
        return totalMinutes;
    }

    public void setTotalMinutes(LocalTime start,LocalTime end) {
        totalMinutes = end.getMinute()- start.getMinute();
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

    @Override
    public void printSlotInfo() {
        System.out.println("Break start at " + start.getHour() + " hour and " + start.getMinute() + ".");
        System.out.println("Break ends at " + end.getHour() + "hour and " + end.getMinute() + ".");
    }

    public String toString() {
        return description;
    }


}
