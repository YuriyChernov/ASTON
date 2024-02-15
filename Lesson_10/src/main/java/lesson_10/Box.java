package lesson_10;


import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> fruitList;

    private double totalWeight;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
        totalWeight = totalWeight + fruit.getWeight();
    }

    public double getWeight() {
        return totalWeight;
    }

    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }
}