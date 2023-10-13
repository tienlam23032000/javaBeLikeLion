package ExLesson6;

// abstract class Employee
public abstract class Employee {

    //attribute
    private int employeeId;
    private String name;

    //contructor
    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    // method abstract
    public abstract void displayInfomation();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Employee otherEmployee = (Employee) obj;
        return this.employeeId == otherEmployee.employeeId && this.name.equals(otherEmployee.name);
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + name;
    }
}
