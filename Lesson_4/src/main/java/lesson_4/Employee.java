package lesson_4;


public class Employee {
    String lastName;
    String name;
    String secondName;
    String jobTitle;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String lastName, String name, String secondName, String jobTitle, String email, String phone, int salary, int age) {
        this.lastName = lastName;
        this.name = name;
        this.secondName = secondName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void form() {
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + secondName);
        System.out.println("Должность: " + jobTitle);
        System.out.println("E-mail: " + email);
        System.out.println("Номер телефона: " + phone);
        System.out.println("Заработная плата: " + salary + " руб.");
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Иванов", "Иван", "Иванович", "Директор",
                "Ivanov@mail.ru", "+79123456789", 1000000, 50);
        employee.form();
        Employee[] employeeArr = new Employee[5];
        employeeArr[0] = new Employee("Сидоров", "Сергей", "Сергеевич",
                "Руководитель отдела продаж", "Sidorov@mail.ru", "+7987654321", 500000, 40);
        employeeArr[1] = new Employee("Васечкин", "Василий", "Васильевич",
                "Менеджер по продажам", "Vasechkin@mail.ru", "+7923747593345584", 100000, 30);
        employeeArr[2] = new Employee("Кузнецов", "Сергей", "Владимирович",
                "Менеджер по продажам", "Kuznetsov@mail.ru", "+784949393838382", 100000, 28);
        employeeArr[3] = new Employee("Петров", "Пётр", "Петрович", "Помощник менеджера",
                "Petrov@mail.ru", "+7423298854434", 50000, 22);
        employeeArr[4] = new Employee("Афанасьев", "Андрей", "Дмитриевич", "Водитель",
                "Afanasiev@mail.ru", "+756674884884393", 50000, 50000);
        for (Employee person : employeeArr) {
            person.form();
        }
    }
}
