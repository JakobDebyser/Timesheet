package timesheet;

import java.time.LocalDate;
import java.time.LocalTime;

public interface Day {
  Slot[] getSlots();

  double getHourlyrate();

  void setHourlyrate(Day day, LocalTime start, LocalTime end);

  void removeSlot(Slot slot);
  double totalWorkedMinutes();
  void addTimeslot(LocalTime from, LocalTime until);
  void addBreakSlot(LocalTime from,LocalTime until);
  LocalDate getDate();

  int getSizeOfslots();
}




