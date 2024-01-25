package lesson_4;

public class Park {
    public static class Attraction {
        String name;
        String workingHours;
        int price;

        public Attraction(String name, String workingHours, int price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void info() {
            System.out.println("Название атракциона: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Цена: " + price + " руб.");
        }
    }

    public static void main(String[] args) {
        Park.Attraction attraction = new Attraction("Колесо обозрения", "С 10 до 23", 1000);
        attraction.info();
    }
}
