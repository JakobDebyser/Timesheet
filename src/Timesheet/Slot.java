package Timesheet;

import java.time.LocalTime;

public interface Slot {

    LocalTime WORKDAY_START_HOUR = null;
    LocalTime WORKDAY_END_HOUR = null;

    void printSlotInfo();
    double getTotalMinutes();

    String description ="slot";
    LocalTime end = null;
    LocalTime start = null;
    long totalMinutes = 0;

}
