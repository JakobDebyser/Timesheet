package VariaNT.be.multimedi.timesheet;


import java.time.LocalDate;


public class WorkWeek implements Week {
    private final Day[] days;

    public WorkWeek(LocalDate start) {
        days = new Day[7];
        for (var i = 0; i < days.length; i++) {
            days[i] = new WorkDay(start.plusDays(i));
        }

    }



    @Override
    public Day getDay(int start_moment) {

        return days[start_moment];
    }


}
