package exercise_2;

public class Circle implements Figure {
    private final double radius;
    private final String backgroundColor;
    private final String borderColor;

    public Circle(double radius, String backgroundColor, String borderColor) {
        this.radius = radius;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimeterCalculation() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double areaCalculation() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Круг: " + "Периметр = " + perimeterCalculation() + ", " +
                "Площадь = " + areaCalculation() + ", " +
                "Цвет фона = " + backgroundColor + ", " +
                "Цвет границы = " + borderColor;
    }
}
