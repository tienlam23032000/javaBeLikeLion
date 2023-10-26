package collection.map;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

public class mainCollectionMap {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();
        // Thêm các cặp key-value vào HashMap
        studentGrades.put("Lam", 95);
        studentGrades.put("Quan", 88);
        studentGrades.put("Hinh", 75);

        // Duyệt qua tất cả các cặp key-value trong HashMap
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println("K: " + entry.getKey() + " : " +" V: " + entry.getValue());
        }
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
    }
}
