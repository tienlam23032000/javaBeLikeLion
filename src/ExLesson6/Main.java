package ExLesson6;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employeesList = new ArrayList<>();
        employeesList.add(new TechnicalEmployee(1, "Lam", "Java"));
        employeesList.add(new OfficeEmployee(2, "Hằng", "HR"));
        employeesList.add(new SalesEmployee(3, "Phương", 5000));

        for (Employee employee : employeesList) {
            employee.displayInfomation();
        }
    }
}