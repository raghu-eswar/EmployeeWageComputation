import java.util.Random;

public class WageComputation {
    
    static Random random = new Random();
    private int wagePerHour;
    private int workHoursPerDay;
    private boolean fullTimeEmployee;

    public WageComputation(int wagePerHour){
        this.wagePerHour = wagePerHour;
        this.fullTimeEmployee = random.nextBoolean();
        this.workHoursPerDay = (this.fullTimeEmployee)? 8 : 4;
    }

    public int getWorkHoursPerDay() {
        return this.workHoursPerDay;
    }

    public boolean isEmployeePresent() {
        return (random.nextInt(3) > 0);
    }

    public int calculateDailyWage() {
        return this.workHoursPerDay * this.wagePerHour;
    }

    public static void main(String[] args) {
        int monthlyWage = 0;
        int currentMonthWorkHours = 0;
        WageComputation wageComputation = new WageComputation(20);

        for (int i=1; i<=20 && currentMonthWorkHours < 100; i++) {
            if (wageComputation.isEmployeePresent()) {
                monthlyWage+= wageComputation.calculateDailyWage();
                currentMonthWorkHours+= wageComputation.getWorkHoursPerDay();
            }
        }
        System.out.println("employee monthly wage of employee : "+monthlyWage);
    }
}