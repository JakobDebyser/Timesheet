package Timesheet;

import java.time.LocalTime;

public interface Day {
  //  long[] minutesByTypes = new Long[];
    void removeSlot(Slot slot);
  long totalWorkedMinutes();
  void addTimeslot(LocalTime from, LocalTime until);
  void addBreakSlot(LocalTime from,LocalTime until);
}




