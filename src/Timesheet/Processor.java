package Timesheet;

public class Processor {
    public double getHours(double input){
        return (int) (input/60);
    }
    public double getMinutes(double input){

        return (int)(Math.round(input*60)) ;
    }
}
