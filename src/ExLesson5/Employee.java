package ExLesson5;

// abstract class Employee
public abstract class Employee {

    //attribute
    public int employeeId;
    public String name;

    //contructor
    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
    // method abstract
    public abstract void displayInfomation();

}
