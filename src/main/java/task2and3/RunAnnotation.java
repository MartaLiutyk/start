package task2and3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class RunAnnotation {

    @LabAnnotation(createdBy = "Marta", lastModified = "05.07.2018")
    public String fieldToAddAnnotation = "hello";
    @LabAnnotation(createdBy = "Nazar", lastModified = "06.07.2018")
    public int age;

    public RunAnnotation() {
    }

    //the only method for task 3
    private static void printAnnotation(LabAnnotation labAnnotation) {
        System.out.print("@LabAnnotaion(");
        System.out.print("created by = " + labAnnotation.createdBy());
        System.out.print(", last modified: " + labAnnotation.lastModified() + ")");
        System.out.println("");
    }

    private static void checkAnnotationByName(Annotation annotation) {
        if (annotation instanceof LabAnnotation) {
            LabAnnotation labAnnotation = (LabAnnotation) annotation;
            printAnnotation(labAnnotation);
        }
    }

    private static void getAnnotations(RunAnnotation object) throws NoSuchFieldException {
        Class classWithAnnotations = object.getClass();
        Field[] fieldAnnotaions = classWithAnnotations.getFields();
        for (int i = 0; i < fieldAnnotaions.length; i++) {
            Field field = fieldAnnotaions[i];
            Annotation annotation = field.getAnnotation(LabAnnotation.class);
            checkAnnotationByName(annotation);
        }
    }

    public static void main(String[] args) throws Exception {
        RunAnnotation classToWorkWith = new RunAnnotation();
        getAnnotations(classToWorkWith);
    }
}
