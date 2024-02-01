package exercise_2;

interface Figure {
    double perimeterCalculation();

    double areaCalculation();

    static void main(String[] args) {
        Figure circle = new Circle(10, "Белый", "Чёрный");
        Figure rectangle = new Rectangle(5, 8, "Жёлтый", "Красный");
        Figure triangle = new Triangle(4, 5, 6, "Синий", "Белый");

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);
    }
}
