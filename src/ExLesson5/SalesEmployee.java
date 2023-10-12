package ExLesson5;

// Subclass SalesEmployee
public class SalesEmployee extends Employee {
    public double sales;

    public SalesEmployee(int employeeId, String name, double sales) {
        super(employeeId, name);
        this.sales = sales;
    }

    public SalesEmployee(int employeeId, String name) {
        super(employeeId, name);
    }


    @Override
    public void displayInfomation() {
        System.out.println("SalesEmployee");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Total Sales: VNĐ" + sales);
    }
}
