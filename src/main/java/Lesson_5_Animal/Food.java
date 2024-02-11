package Lesson_5_Animal;

public class Food {
    private int amountOfFood = 1;

    public void increaseAmountOfFood (int amountOfFood) {
        this.amountOfFood += amountOfFood;
    }

    public void decreaseAmountOfFood (int amountToDecrease) {
        amountOfFood -= amountToDecrease;
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }

    public void info() {
        System.out.println();
        System.out.println("Amount of food on the plate - " + amountOfFood);
        System.out.println();
    }
}

