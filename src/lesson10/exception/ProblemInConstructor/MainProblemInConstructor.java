package lesson10.exception.ProblemInConstructor;

public class MainProblemInConstructor {
    public static void main(String[] args) {

        try {
            DemoException demo = new DemoException();
        } catch (SomeException e) {
            System.out.println("Đã xảy ra ngoại lệ: " + e.getMessage());
        }
    }

}
