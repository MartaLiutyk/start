package task5;

import task4.MethodContainer;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        EmptyClass emptyClass = new EmptyClass();
        Class classToWork = emptyClass.getClass();
        Field field = classToWork.getField("randomNumber");
        field.setAccessible(true);
        Object newValue = field.getType().newInstance();
        if (newValue instanceof Integer) {
            newValue = (Object) 1;
        }
        if (newValue instanceof String) {
            newValue = (Object) "";
        }
        if (newValue instanceof Boolean) {
            newValue = (Object) true;
        }
        if (newValue instanceof Integer) {
            newValue = (Object) 1;
        }

        field.set(classToWork, newValue);
    }
}
