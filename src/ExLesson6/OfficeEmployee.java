package ExLesson6;
// subclass OfficeEmployee
public class OfficeEmployee extends Employee{

//attribute
    private String department; // Phòng ban
// get attribute from supper class
    public OfficeEmployee(int employeeId, String name, String department) {
        super(employeeId, name);
        // contructor
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    // Override method
    @Override
    public void displayInfomation() {
        System.out.println("OfficeEmployee");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Department: " + getDepartment());
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

        OfficeEmployee otherEmployee = (OfficeEmployee) obj;

        return department.equals(otherEmployee.department);
    }

    @Override
    public String toString() {
        return "Employee ID: " + getEmployeeId() + ", Name: " + getName() + ", Department: " + department;
    }
}
