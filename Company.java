import java.util.ArrayList;
import java.util.Map;

public class Company {

    private String companyName;
    private EmployeeWageBuilder wageBuilder;
    private ArrayList<Employee> employees;

    public Company(String companyName, EmployeeWageBuilder wageBuilder, ArrayList<Employee> employees) {
        this.companyName = companyName;
        this.wageBuilder = wageBuilder;
        this.employees = employees;
    }

    public Map<String, Integer> calculateEmployeesWage() {
        return wageBuilder.calculateMonthlyWage(employees);
    }
}
