package Timesheet;

public interface Day {
  //  long[] minutesByTypes = new Long[];
    void removeSlot(Slot slot);

    void addSlot(Slot slot);

    long totalWorkedMinutes();
}
