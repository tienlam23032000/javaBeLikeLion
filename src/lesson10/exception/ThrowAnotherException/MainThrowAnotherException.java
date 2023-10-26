package lesson10.exception.ThrowAnotherException;

public class MainThrowAnotherException {
    public static void someMethod2() throws ExceptionA {
        // Ném ngoại lệ ExceptionA từ phương thức someMethod2()
        throw new ExceptionA("Ngoại lệ A đã xảy ra trong someMethod2()");
    }

    public static void someMethod() throws ExceptionB {
        try {
            someMethod2();
        } catch (ExceptionA e) {
            // Ném ngoại lệ ExceptionB sau khi bắt ngoại lệ ExceptionA từ someMethod2()
            throw new ExceptionB("Ngoại lệ B đã xảy ra trong someMethod()");
        }
    }

    public static void main(String[] args) {
        try {
            // Gọi phương thức someMethod() từ phương thức main và bắt ngoại lệ ExceptionB nếu có.
            someMethod();
        } catch (ExceptionB e) {
            System.out.println("Đã xảy ra ngoại lệ: " + e.getMessage());
            e.printStackTrace(); // In thông tin lần vết (stack trace) của ngoại lệ.
        }
    }
}