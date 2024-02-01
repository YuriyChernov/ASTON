package exercise_2;

public class Rectangle implements Figure {
    private final double width;
    private final double height;
    private final String backgroundColor;
    private final String borderColor;

    public Rectangle(double width, double height, String backgroundColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public double perimeterCalculation() {
        return 2 * (width + height);
    }

    @Override
    public double areaCalculation() {
        return width * height;
    }

    public String toString() {
        return "Прямоугольник: " + "Периметр = " + perimeterCalculation() + ", " +
                "Площадь = " + areaCalculation() + ", " +
                "Цвет фона = " + backgroundColor + ", " +
                "Цвет границы = " + borderColor;
    }
}
