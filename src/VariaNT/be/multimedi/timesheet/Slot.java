package VariaNT.be.multimedi.timesheet;

import java.time.LocalTime;

public interface Slot {

    LocalTime WORKDAY_START_HOUR = null;
    LocalTime WORKDAY_END_HOUR = null;

    void printSlotInfo();
    double getTotalMinutes();

    String description ="slot";
    LocalTime getEnd() ;
    LocalTime getStart();
    long totalMinutes = 0;

}
