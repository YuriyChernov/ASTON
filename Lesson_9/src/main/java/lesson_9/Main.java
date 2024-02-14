package lesson_9;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> numbers = IntStream.generate(() -> random.nextInt(20) + 1)
                .limit(5)
                .boxed()
                .collect(Collectors.toSet());
        System.out.println("Рандомные числа: " + numbers);

        long evenCount = numbers.stream()
                .filter(number -> number % 2 == 0).count();
        System.out.println("Кол-во чётных чисел: " + evenCount);
        System.out.println();

        List<String> list = Arrays.asList("Highload", "High", "Load", "Highload");

        long count = list.stream()
                .filter(x -> x.equals("High"))
                .count();
        System.out.println("High встречается раз: " + count);

        String firstElement = list.stream()
                .findFirst()
                .orElse("0");
        System.out.println("Первый элемент: " + firstElement);

        String lastElement = list.stream()
                .reduce((a, b) -> b)
                .orElse("0");
        System.out.println("Последний элемент: " + lastElement);

        List<String> collection = Arrays.asList("f10", "f15", "f2", "f4", "f4");
        collection.sort((s1, s2) -> {
            int num1 = Integer.parseInt(s1.substring(1));
            int num2 = Integer.parseInt(s2.substring(1));
            return Integer.compare(num1, num2);
        });

        String[] sortedArray = collection.toArray(new String[0]);
        for (String s : sortedArray) {
            System.out.println(s);
        }

        List<String> logins = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите логин: ");
            String login = scanner.nextLine();
            if (login.isEmpty()) {
                break;
            }
            logins.add(login);
        }
        logins.stream()
                .filter(login -> login.startsWith("f"))
                .forEach(System.out::println);
    }
}

