package Timesheet;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public interface Day {
  Slot[] getSlots();

  double getHourlyrate();

  void setHourlyrate(DayOfWeek day, LocalTime time);

  void removeSlot(Slot slot);
  double totalWorkedMinutes();
  void addTimeslot(LocalTime from, LocalTime until);
  void addBreakSlot(LocalTime from,LocalTime until);
  LocalDate getDate();
}




