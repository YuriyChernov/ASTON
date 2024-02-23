package Lesson_12;

public class Factorial {
    public int factorialNumber(int number) {
        int factorialNumber = 1;
        if (number == 0) {
            return factorialNumber;
        } else if (number < 0) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }
        for (int i = number; i > 1; i--) {
            factorialNumber *= i;
        }
        return factorialNumber;
    }
}
