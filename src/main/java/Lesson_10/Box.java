package Lesson_10;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruitList;

    public Box() {
        fruitList = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            fruitList.add(fruit);
        }
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruitList) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> boxToCompare) {
        return Math.abs(this.getWeight() - boxToCompare.getWeight()) <= 0;
    }

    public void moveFruits(Box<T> boxToMoveTo) {
        if (this == boxToMoveTo)
            System.out.println("Cannot be transferred from a box to the same box");
        else {
            boxToMoveTo.fruitList.addAll(this.fruitList);
            this.fruitList.clear();
        }
    }
}