package task7;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class CustomClass {

    public static <T> String getInfoAboutClass(T object) {
        StringBuilder result = new StringBuilder();
        Class objectClass = object.getClass();
        result.append(getHeader(objectClass));
        result.append(getFields(objectClass));
        result.append(getMethods(objectClass));
        return result.toString();
    }

    public static String getHeader(Class classToWorkWith) {
        String modifier = Modifier.toString(classToWorkWith.getModifiers());
        String name = classToWorkWith.getName();
        return modifier + name;
    }

    private static String getFields(Class classToWorkWith) {
        StringBuilder result = new StringBuilder();
        Arrays.asList(classToWorkWith.getDeclaredFields()).forEach(f -> {
            result.append(Modifier.toString(f.getModifiers()) + " ");
            result.append(f.getName() + "\n");
        });
        return result.toString();
    }

    private static String getMethods(Class classToWorkWith) {
        StringBuilder result = new StringBuilder();
        Arrays.asList(classToWorkWith.getDeclaredMethods()).forEach(m -> {
            result.append(Modifier.toString(m.getModifiers()));
            result.append(m.getReturnType().getName());
            result.append(m.getName() + "(");
            Arrays.asList(m.getParameterTypes()).forEach(t -> {
                result.append(t.getName());
            });
        });
        return result.toString();
    }
}

