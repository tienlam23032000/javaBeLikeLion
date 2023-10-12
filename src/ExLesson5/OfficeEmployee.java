package ExLesson5;
// subclass OfficeEmployee
public class OfficeEmployee extends Employee{

//attribute
    public String department; // Phòng ban
// get attribute from supper class
    public OfficeEmployee(int employeeId, String name, String department) {
        super(employeeId, name);
        // contructor
        this.department = department;
    }


    // Override method
    @Override
    public void displayInfomation() {
        System.out.println("OfficeEmployee");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }

}
