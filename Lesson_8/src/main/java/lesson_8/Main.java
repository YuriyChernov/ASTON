package lesson_8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        ArrayList<String> colour = new ArrayList<>();
        Collections.addAll(colour, "Red", "Yellow", "Blue", "White", "Red", "Black", "Green", "Brown", "Blue",
                "Pink", "Black", "White", "Orange", "Grey", "Pink");
        Set<String> uniqColours = new LinkedHashSet<>(colour);
        System.out.println("Уникальные значения: " + uniqColours);
        System.out.println();

        Map<String, Long> frequency = colour.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
        frequency.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println();

        Phonebook phonebook = new Phonebook();
        phonebook.addContact("8123456789", "Иванов");
        phonebook.addContact("8234567891", "Петров");
        phonebook.addContact("8345678912", "Сидоров");
        phonebook.addContact("8456789123", "Петров");
        phonebook.getContact("Петров");
    }
}