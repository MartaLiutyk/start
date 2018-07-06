package task4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvoke {

    static MethodContainer methodContainer = new MethodContainer();
    static Class container = methodContainer.getClass();

    public static void invokeMethods() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method sumAccessor = container.getDeclaredMethod("sumOfNumbers", Integer.class, Integer.class);
        sumAccessor.invoke("sumOfNumbers", 3, 4);
        Method upperCaseAccessor = container.getDeclaredMethod("makeBigLetters", String.class);
        upperCaseAccessor.invoke("makeBigLetters", "Abra ca dabra");
        Method smileAccessor = container.getDeclaredMethod("printSmile", Boolean.class);
        smileAccessor.invoke("printSmile", true);
    }

    public static void main(String[] args) throws Exception {
        invokeMethods();
    }
}
