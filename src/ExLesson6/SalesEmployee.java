package ExLesson6;

// Subclass SalesEmployee
public class SalesEmployee extends Employee {
    private double sales;

    public SalesEmployee(int employeeId, String name, double sales) {
        super(employeeId, name);
        this.sales = sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getSales() {
        return sales;
    }

    @Override
    public void displayInfomation() {
        System.out.println("SalesEmployee");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Total Sales: VNĐ" + getSales());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        if (!super.equals(obj)) {
            return false;
        }

        SalesEmployee otherEmployee = (SalesEmployee) obj;
        return Double.compare(otherEmployee.sales, sales) == 0;
    }

    @Override
    public String toString() {
        return "Employee ID: " + getEmployeeId() + ", Name: " + getName() + ", Sales: " + sales;
    }
}
