import java.util.Random;

public class WageComputation {
    
    static Random random = new Random();

    public boolean isEmployeePresent() {
        return (random.nextInt(3) > 0);
    }
    public static void main(String[] args) {
        WageComputation WageComputation = new WageComputation();
        boolean isPresent = WageComputation.isEmployeePresent();
        if (isPresent)
            System.out.println("employee was present");
        else
            System.out.println("employee was not present");
    }
}