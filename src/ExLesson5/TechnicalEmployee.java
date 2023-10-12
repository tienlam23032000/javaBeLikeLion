package ExLesson5;

public class TechnicalEmployee extends Employee {
    public String skill;


    public TechnicalEmployee(int employeeId, String name, String skill) {
        super(employeeId, name);
        this.skill = skill;
    }

    @Override
    public void displayInfomation() {
        System.out.println("TechnicalEmployee");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Technical Skill: " + skill);
    }
}
