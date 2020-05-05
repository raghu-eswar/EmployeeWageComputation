import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Employee {
    static Random random = new Random();

    private String employeeId;
    private String name;
    private int wagePerHour;
    private int workHoursPerDay;
    private boolean isFullTimeEmployee;
    private int currentMonthWage;
    private Map<String, ArrayList<Integer>> employeesDailyWageList;

    public Employee(String name, String employeeId) {
        this(name, employeeId,20, 8, "full-time");
    }

    public Employee(String name, String employeeId, int wagePerHour, int workHoursPerDay, String employeeType) {
        this.name = name;
        this.employeeId = employeeId;
        this.wagePerHour = wagePerHour;
        this.workHoursPerDay = workHoursPerDay;
        this.isFullTimeEmployee = employeeType.equalsIgnoreCase("full-time");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(int wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    public int getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public void setWorkHoursPerDay(int workHoursPerDay) {
        this.workHoursPerDay = workHoursPerDay;
    }

    public boolean getIsFullTimeEmployee() {
        return isFullTimeEmployee;
    }

    public void setIsFullTimeEmployee(boolean fullTimeEmployee) {
        this.isFullTimeEmployee = fullTimeEmployee;
    }

    public int getCurrentMonthWage() {
        return currentMonthWage;
    }

    public void setCurrentMonthWage(int currentMonthWage) {
        this.currentMonthWage = currentMonthWage;
    }

    public Map<String, ArrayList<Integer>> getEmployeesDailyWageList() {
        return employeesDailyWageList;
    }

    public void setEmployeesDailyWageList(Map<String, ArrayList<Integer>> employeesDailyWageList) {
        this.employeesDailyWageList = employeesDailyWageList;
    }

    public int calculateDailyWage() {
        return (this.workHoursPerDay * this.wagePerHour);
    }

    public boolean isEmployeePresent() {
        return (random.nextInt(3) > 0);
    }
}
