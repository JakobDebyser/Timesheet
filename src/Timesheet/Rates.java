package Timesheet;

public enum Rates {
    MON(15, 20), TUE(15, 20), WED(15, 20), THU(15, 20), FRI(15, 20), WEEK(15, 20), SAT(25, 25), SUN(35, 35);
    public final double normalHourlyRate;
    public final double overtimeHourlyRate;

    Rates(double normalHourlyRate, double overtimeHourlyRate) {
        this.normalHourlyRate = normalHourlyRate;
        this.overtimeHourlyRate = overtimeHourlyRate;
    }

    @Override
    public String toString() {

        return name();
    }

    public static void printRates(Rates rate) {
        if (rate.ordinal() < 6) {
            System.out.println(rate.name() + " normal hourly rate = " + rate.normalHourlyRate + "€/hour");
            System.out.println(rate.name() + " Overtime hourly rate = " + rate.overtimeHourlyRate + "€/hour");
        } else {
            System.out.println(rate.name() + " hourly rate = " + rate.normalHourlyRate + "€/hour");
        }
    }
}
