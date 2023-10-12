import ExLesson5.Employee;
import ExLesson5.OfficeEmployee;
import ExLesson5.SalesEmployee;
import ExLesson5.TechnicalEmployee;

public class Main {
    public static void main(String[] args) {
        OfficeEmployee oe1 = new OfficeEmployee(1, "NTL", "HR");
        OfficeEmployee oe2 = new OfficeEmployee(2, "Lam", "Accounting");
        SalesEmployee se1 = new SalesEmployee(3, "Hằng", 5000);
        SalesEmployee se2 = new SalesEmployee(4, "Quân", 6000);
        TechnicalEmployee te1 = new TechnicalEmployee(5, "Phương", "Java dev");
        TechnicalEmployee te2 = new TechnicalEmployee(6, "Hinh", "PHP dev");

        Employee[] employees = new Employee[]{ oe1, oe2, se1, se2, te1, te2};
        for (Employee employee : employees) {
            employee.displayInfomation();
            System.out.println();
        }
    }
}