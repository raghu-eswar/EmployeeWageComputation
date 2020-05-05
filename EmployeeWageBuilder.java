import java.util.Random;

public class WageComputation {
    
    static Random random = new Random();
    private boolean isEmployeePresent;
    private int wagePerHour;
    private int workHoursPerDay;
    private boolean fullTimeEmployee;

    public WageComputation(int wagePerHour, int workHoursPerDay){
        this.wagePerHour = wagePerHour;
        this.workHoursPerDay = workHoursPerDay;
        this.fullTimeEmployee = random.nextBoolean();
    }

    public boolean isEmployeePresent() {
        return (random.nextInt(3) > 0);
    }

    public int calculateDailyWage() {
        return this.workHoursPerDay * this.wagePerHour;
    }

    public static int calculateMonthlyWage(WageComputation company) {
        int monthlyWage = 0;
        for (int i=1; i<=20; i++) {
            if (company.isEmployeePresent()) 
                monthlyWage+= company.calculateDailyWage();
        }
        return monthlyWage;
    }

    public static void main(String[] args) {
        WageComputation D_Mart = new WageComputation(20, 8);
        WageComputation reliance = new WageComputation(30, 8);

        int D_martMonthlyWage = WageComputation.calculateMonthlyWage(D_Mart);
        int relaincMonthlyWage = WageComputation.calculateMonthlyWage(reliance);
        System.out.println("Dmart employee monthly wage : "+D_martMonthlyWage);
        System.out.println("Reliance employee monthly wage : "+relaincMonthlyWage);
    }
}
