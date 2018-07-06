package task5;

public class EmptyClass {

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    private Integer randomNumber;

    public EmptyClass() {
    }

    public EmptyClass(int randomNumber) {
        this.randomNumber = randomNumber;
    }
}
