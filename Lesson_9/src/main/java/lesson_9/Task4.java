package lesson_9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

public class Task4 {
    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    "}";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }


    public static void main(String[] args) {

        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );


        double averageAgeOfMaleStudents = students.stream()
                .filter(student -> student.getGender().equals(Gender.MAN))
                .mapToInt(Student::getAge)
                .average()
                .orElse(0);
        System.out.println("Средний возраст студентов мужского пола: " + averageAgeOfMaleStudents);

        Collection<Student> conscription = students.stream()
                .filter(student -> student.getAge() >= 18 && student.getAge() <= 27 && student.gender.equals(Gender.MAN))
                .collect(Collectors.toList());
        System.out.println("Студенты, которым грозит призыв: ");
        for (Student student : conscription) {
            System.out.println(student.getName());
        }
    }
}