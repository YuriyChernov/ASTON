package lesson_10;


public abstract class Fruit {
    private final double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        System.out.println(appleBox.getWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        System.out.println(orangeBox.getWeight());

        System.out.println(orangeBox.compare(appleBox));
    }
}

