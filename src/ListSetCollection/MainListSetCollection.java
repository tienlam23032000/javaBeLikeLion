package ListSetCollection;

import ExLesson6.Employee;
import ExLesson6.OfficeEmployee;
import ExLesson6.TechnicalEmployee;

import java.util.*;

public class MainListSetCollection {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("A");
        strings.add("A"); //k luu tru phan tu trung lap
        strings.add("B");
        strings.add(null);
        strings.add(null);//k luu tru phan tu trung lap

        System.out.println(strings.size());

        System.out.println("for-each");
        for (String s : strings){
            System.out.println(s);
        }
        // key : value
        /// 12313 : A
        /// 43242 : B
        System.out.println("iterator");
        Iterator<String> iter = strings.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            System.out.println(s);
        }

        System.out.println("TreeSet");
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(2);
        numbers.add(10);

        for (int i : numbers){
            System.out.println(i);
        }

        Set<Employee> employees = new TreeSet<>(); //hash Code
        employees.add(new TechnicalEmployee(1,"lam", "IT"));
        employees.add(new TechnicalEmployee(2,"quan", "IT"));
        employees.add(new TechnicalEmployee(1,"hinh", "IT"));

        for (Employee ep : employees){
            System.out.println(ep.toString());
        }
    }
}
