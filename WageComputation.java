import java.util.Random;

public class WageComputation {
    
    static Random random = new Random();
    private int wagePerHour;
    private int workHoursPerDay;

    public WageComputation(int wagePerHour, int workHoursPerDay) {
        this.wagePerHour = wagePerHour;
        this.workHoursPerDay = workHoursPerDay;
    }

    public boolean isEmployeePresent() {
        return (random.nextInt(3) > 0);
    }

    public int calculateDailyWage() {
        return this.workHoursPerDay * this.wagePerHour;
    }

    public static void main(String[] args) {
        WageComputation wageComputation = new WageComputation(20, 8);
        boolean isPresent = wageComputation.isEmployeePresent();
        if(isPresent) 
            System.out.println("daily wage of employe : "+wageComputation.calculateDailyWage());
        else
            System.out.println("employee was not present");
    }
}