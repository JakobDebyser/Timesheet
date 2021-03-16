package Timesheet;

import java.time.Duration;
import java.time.LocalTime;

import java.time.format.DateTimeFormatter;

public class TimeSlot implements Slot{
    private String description = "TimeSlot";
    private long totalMinutes ;
    private LocalTime start ;
    private LocalTime end;
    public TimeSlot(LocalTime start, LocalTime end){
        this.start = start;
        this.end= end;
        this.totalMinutes = Duration.between(end,start).toMinutes();
    }
    public TimeSlot(LocalTime start,LocalTime end,String text){
        this.start = start;
        this.end = end;
        description= text;
        totalMinutes = Duration.between(end,start).toMinutes();
    }

    public long getTotalMinutes() {
        return totalMinutes;
    }

    public void setTotalMinutes(long totalMinutes) {
        this.totalMinutes = totalMinutes;
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
