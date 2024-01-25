package lesson_2;

public class Main {
    public void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public void checkSumSign() {
        int a = 5;
        int b = 10;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public void printColor() {
        int value = 3;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public void compareNumbers() {
        int a = 25;
        int b = 50;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Задание 1");
        main.printThreeWords();
        System.out.println();
        System.out.println("Задания 2");
        main.checkSumSign();
        System.out.println();
        System.out.println("Задание 3");
        main.printColor();
        System.out.println();
        System.out.println("Задание 4");
        main.compareNumbers();
    }
}
