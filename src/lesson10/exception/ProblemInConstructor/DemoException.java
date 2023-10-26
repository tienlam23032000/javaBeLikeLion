package lesson10.exception.ProblemInConstructor;

class DemoException {
    public DemoException() throws SomeException {
        // Ném một ngoại lệ SomeException với thông báo khi có sự cố trong constructor.
        throw new SomeException("Có sự cố xảy ra trong constructor.");
    }
}
