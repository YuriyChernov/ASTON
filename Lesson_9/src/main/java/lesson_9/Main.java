package lesson_9;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static Set<Integer> getRandomSet() {
        return new Random()
                .ints(0, 20)
                .limit(5)
                .boxed()
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {

        System.out.println(getRandomSet());
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

        Task4 task4 = new Task4();
        System.out.println("Средний возраст студентов мужского пола: " + task4.getAverageAgeOfMaleStudents());

        List<Task4.Student> conscription = task4.getConscription();
        System.out.println("Студенты, которым грозит призыв: ");
        for (Task4.Student student : conscription) {
            System.out.println(student.getName());
        }
        System.out.println();

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

