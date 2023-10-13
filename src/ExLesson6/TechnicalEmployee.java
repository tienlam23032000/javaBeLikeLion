package ExLesson6;

public class TechnicalEmployee extends Employee {
    private String skill;


    public TechnicalEmployee(int employeeId, String name, String skill) {
        super(employeeId, name);
        this.skill = skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    @Override
    public void displayInfomation() {
        System.out.println("TechnicalEmployee");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Technical Skill: " + getSkill());
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        TechnicalEmployee otherTechnicalEmployee = (TechnicalEmployee) obj;
        return super.equals(obj) && this.skill.equals(otherTechnicalEmployee.skill);
    }

    // Ghi đè phương thức toString để tạo chuỗi đại diện cho TechnicalEmployee
    @Override
    public String toString() {
        return "Technical Employee ID: " + getEmployeeId() + ", Name: " + getName() + ", Skill: " + skill;
    }
}
