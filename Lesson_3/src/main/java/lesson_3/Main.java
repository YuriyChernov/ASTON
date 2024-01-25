package lesson_3;

public class Main {
    public void sum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public void number(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public void number2(int a) {
        if (a <= 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public void helloWorld(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }

    }

    public void method(int len, int initialValue) {
        int[] arr5 = new int[len];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = initialValue;
            System.out.println(arr5[i]);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Задание 1");
        main.sum(10, 5);
        System.out.println();

        System.out.println("Задание 2");
        main.number(-10);
        System.out.println();

        System.out.println("Задание 3");
        main.number2(5);
        System.out.println();

        System.out.println("Задание 4");
        main.helloWorld("Hello World!", 5);
        System.out.println();

        System.out.println("Задание 5");
        main.isLeapYear(2024);
        System.out.println();

        System.out.println("Задание 6");

        int[] nums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
            System.out.println(nums[i]);
        }

        System.out.println();
        System.out.println("Задание 7");

        int[] arr = new int[100];
        for (int i = 1; i <= arr.length; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задание 8");

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
            }
            System.out.println(arr2[i]);
        }

        System.out.println();
        System.out.println("Задание 9");

        int[][] arr3 = new int[5][5];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                arr3[i][i] = 1;
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Задание 10");
        main.method(5, 10);
    }
}