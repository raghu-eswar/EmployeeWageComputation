import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeWageBuilder {
    public Map<String, Integer> calculateMonthlyWage(ArrayList<Employee> employees) {
        Map<String, Integer> employeesWages = new HashMap<String, Integer>();
        for (Employee employee : employees) {
            int currentMonthWage = 0;
            int currentMonthWorkHours = 0;
            for (int i=1; i<=20 && currentMonthWorkHours < 100; i++) {
                if (employee.isEmployeePresent()) {
                    currentMonthWage+= employee.calculateDailyWage();
                    currentMonthWorkHours+= employee.getWorkHoursPerDay();
                }
            }
            employeesWages.put(employee.getEmployeeId(), currentMonthWage);
            employee.setCurrentMonthWage(currentMonthWage);
        }
        return employeesWages;
    }
}
