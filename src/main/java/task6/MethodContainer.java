package task6;

public class MethodContainer {
    public MethodContainer() {
    }

    public void myMethod(String a, int... args) {
        System.out.println("first method");
    }

    public void myMethod(String... args) {
        System.out.println("second method");
    }

}
