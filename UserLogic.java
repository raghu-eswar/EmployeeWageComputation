import java.util.ArrayList;
import java.util.Map;

public class UserLogic {

    public static void main(String[] args) {
        Employee raghu = new Employee("raghu", "raghu01");
        Employee eswar = new Employee("eswar", "eswar02");
        Employee ramu = new Employee("ram", "ram01");
        Employee krishna = new Employee("krishna", "krishna02");
        ArrayList<Employee> D_martEmployees = new ArrayList<>();
        ArrayList<Employee> relianceEmployees = new ArrayList<>();
        EmployeeWageBuilder wageBuilder = new EmployeeWageBuilder();
        D_martEmployees.add(raghu);
        D_martEmployees.add(eswar);
        relianceEmployees.add(ramu);
        relianceEmployees.add(krishna);
        Company D_Mart = new Company("D mart", wageBuilder, D_martEmployees);
        Company reliance = new Company("Reliance", wageBuilder, relianceEmployees);
        Map<String, Integer> D_MartWages = D_Mart.calculateEmployeesWage();
        Map<String, Integer> relianceWages = reliance.calculateEmployeesWage();
        System.out.println("D mart wages.........");
        for (String key : D_MartWages.keySet()) {
            System.out.println("Employee "+key + " wage :"+ D_MartWages.get(key));
        }System.out.println("Reliance wages........");
        for (String key : relianceWages.keySet()) {
            System.out.println("Employee "+key + " wage :"+ relianceWages.get(key));
        }
        System.out.println("D mart total wage : "+D_Mart.totalWageByCompany());
        System.out.println("Reliance total wage : "+reliance.totalWageByCompany());
    }
}
