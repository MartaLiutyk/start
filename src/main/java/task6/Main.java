package task6;

import java.lang.reflect.Method;

public class Main {
    private static void invokeMethods(Class container) throws NoSuchMethodException {
        Method myMethod1 = container.getMethod("myMethod", String.class, int[].class);
        Method myMethod2 = container.getMethod("myMethod", String[].class);
    }

    public static void main(String[] args) throws NoSuchMethodException {
        MethodContainer methodContainer = new MethodContainer();
        Class container = methodContainer.getClass();
        invokeMethods(container);
    }
}
