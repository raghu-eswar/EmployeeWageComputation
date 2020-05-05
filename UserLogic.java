import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class UserLogic {

    public static void main(String[] args) {
        Employee raghu = new Employee("raghu", "raghu01");
        Employee eswar = new Employee("eswar", "eswar02");
        Employee ramu = new Employee("ramu", "ramu03");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(raghu);
        employees.add(eswar);
        employees.add(ramu);
        Company company = new Company("my company", new EmployeeWageBuilder(), employees);
        Map<String, Integer> wages = company.calculateEmployeesWage();
        Iterator<String> iterator = wages.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key+"       "+wages.get(key));
        }
        System.out.println(raghu.getCurrentMonthWage()+"  "+eswar.getCurrentMonthWage()+"  "+ramu.getCurrentMonthWage());
    }
}
