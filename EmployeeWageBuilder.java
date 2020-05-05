import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeWageBuilder {
    public Map<String, Integer> calculateMonthlyWage(ArrayList<Employee> employees) {
        Map<String, Integer> employeesWages = new HashMap<String, Integer>();
        for (Employee employee : employees) {
            ArrayList<Integer> dailyWage = new ArrayList<>();
            Map<String, ArrayList<Integer>> employeeDailyWageList = new HashMap<>();
            int currentMonthWage = 0;
            int currentMonthWorkHours = 0;
            for (int i=1; i<=20 && currentMonthWorkHours < 100; i++) {
                int toDayWage = 0;
                if (employee.isEmployeePresent()) {
                    toDayWage = employee.calculateDailyWage();
                    currentMonthWage+= toDayWage;
                    currentMonthWorkHours+= employee.getWorkHoursPerDay();
                    dailyWage.add(toDayWage);
                }
                else
                    dailyWage.add(0);
            }
            employeesWages.put(employee.getEmployeeId(), currentMonthWage);
            employeeDailyWageList.put("month",dailyWage);
            employee.setEmployeesDailyWageList(employeeDailyWageList);
            employee.setCurrentMonthWage(currentMonthWage);
        }
        return employeesWages;
    }

    public int companyTotalWage(ArrayList<Employee> employees) {
        int companyTotalWage = 0;
        for (Employee employee: employees) {
            companyTotalWage+= employee.getCurrentMonthWage();
        }
        return companyTotalWage;
    }
}
