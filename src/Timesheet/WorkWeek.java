package Timesheet;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WorkWeek implements Week {
    private String firstDayOfWeek;

    public WorkWeek(LocalDate start) {
        Day[] days = new Day[7];
        for (var i = 0; i < days.length; i++) days[i] = new WorkDay();

    }


    public String getFirstDayOfWeek() {
        return firstDayOfWeek;
    }

    public void setFirstDayOfWeek(String firstDayOfWeek) {
        this.firstDayOfWeek = firstDayOfWeek;
    }
}
