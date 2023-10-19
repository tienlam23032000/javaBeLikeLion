package exLesson8;

public class MainExLesson8 {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom();

        // add student to class
        classRoom.addStudent(new Student("s1", 18, 9));
        classRoom.addStudent(new Student("s2", 17, 8.5));
        classRoom.addStudent(new Student("s3", 16, 7));
        classRoom.addStudent(new Student("s4", 19, 7.5));
        classRoom.addStudent(new Student("s5", 17, 9.5));

        // print list student in class
        System.out.println("List students in class:");
        for (Student student : classRoom.getStudents()) {
            System.out.println(student);
        }

        // get Student highest score
        Student highestScoringStudent = classRoom.getHighestScoringStudent();
        if (highestScoringStudent != null) {
            System.out.println("The student with the highest score is: " + highestScoringStudent);
        }
    }
}