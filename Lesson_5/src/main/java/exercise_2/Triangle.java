package exercise_2;

public class Triangle implements Figure {
    private final double side1;
    private final double side2;
    private final double side3;
    private final String backgroundColor;
    private final String borderColor;

    public Triangle(double side1, double side2, double side3, String backgroundColor, String borderColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimeterCalculation() {
        return side1 + side2 + side3;
    }

    @Override
    public double areaCalculation() {
        double semiperimeter = perimeterCalculation() / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
    }

    public String toString() {
        return "Треугольник: " + "Периметр = " + perimeterCalculation() + ", " +
                "Площадь = " + areaCalculation() + ", " +
                "Цвет фона = " + backgroundColor + ", " +
                "Цвет границы = " + borderColor;
    }
}
