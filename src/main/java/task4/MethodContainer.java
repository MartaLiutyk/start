package task4;

public class MethodContainer {

    public MethodContainer() {
    }

    public int sumOfNumbers(Integer a, Integer b) {
        int sum = a + b;
        return sum;
    }

    public String makeBigLetters(String text) {
        String result = text.toUpperCase();
        return result;
    }

    public void printSmile(Boolean emotion) {
        if (emotion = true) {
            System.out.println(" :) ");
        } else {
            System.out.println(" :( ");
        }
    }
}
