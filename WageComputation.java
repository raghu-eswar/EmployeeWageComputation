import java.util.Random;

public class WageComputation {
    
    static Random random = new Random();
    private static boolean isEmployeePresent = (random.nextInt(3) > 0 );
    private static int wagePerHour = 20;
    private static boolean fullTimeEmployee = random.nextBoolean();
    private static int workHoursPerDay = (fullTimeEmployee)? 8 : 4;  

    public static int calculateDailyWage() {
        return workHoursPerDay * wagePerHour;
    }

    public static int calculateMonthlyWage() {
        int monthlyWage = 0;
        int currentMonthWorkHours = 0;
        for (int i=1; i<=20 && currentMonthWorkHours < 100; i++) {
            isEmployeePresent = (random.nextInt(3) > 0 );
            if (isEmployeePresent) monthlyWage+= calculateDailyWage();
        }
        return monthlyWage;
    }

    public static void main(String[] args) {
        int monthlyWage = WageComputation.calculateMonthlyWage();
        System.out.println("employee monthly wage : "+monthlyWage);
    }
}