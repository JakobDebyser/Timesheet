package Timesheet;


import java.time.LocalDate;


public class WorkWeek implements Week {
    private final Day[] days;
    private Week week;
    private String FirstDayOfWeek;
    public WorkWeek(LocalDate start) {
        days = new Day[7];
        for (var i = 1; i < days.length; i++) {
            days[i] = new WorkDay();
        }
        days[0]= new WorkDay(start);
    }

    public  Week getWeek() {

        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

    @Override
    public Day getDay(int start_moment) {

        return days[start_moment];
    }
}
