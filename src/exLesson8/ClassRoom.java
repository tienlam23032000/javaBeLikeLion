package exLesson8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ClassRoom {
    private Set<Student> students = new HashSet<>();

    public ClassRoom() {
        this.students = students;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public boolean addStudent(Student student) {
        if (students.size() >= 20) {
            System.out.println("Class full, canot crate student.");
            return false;
        }
        students.add(student);
        return true;
    }

    public Student getHighestScoringStudent() {
        if (students.size() < 5) {
            System.out.println("Class needs at least 5 students");
            return null;
        }
        if (students.isEmpty()) {
            System.out.println("The class currently has no students.");
            return null;
        }
        Student highestScoringStudent = Collections.max(students); //(s1, s2) -> s1.getScore() - s2.getScore()) ;
        return highestScoringStudent;
    }
}
