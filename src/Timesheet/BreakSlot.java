package Timesheet;

import java.time.LocalTime;

public class BreakSlot implements Slot {
    String description = "BreakSlot";
    LocalTime start = null;
    LocalTime end = null;

    public BreakSlot(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;

    }

    public BreakSlot(LocalTime start, LocalTime end, String text) {
        this.start = start;
        this.end = end;
        this.description = text;
    }

    @Override
    public void printSlotInfo() {
        System.out.println("Break start at "+start.getHour()+" hour and "+start.getMinute()+".");
        System.out.println("Break ends at "+end.getHour()+ "hour and "+end.getMinute()+".");
    }

    public String toString() {
        return description;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return hashCode();
    }

}
