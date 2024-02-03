package Lesson_5_Animal;

public class Food {
    private static int amountOfFood=10;

    public void increaseAmountOfFood (int amountOIncrease) {
        this.amountOfFood += amountOfFood;
    }

    public void decreaseAmountOfFood (int amountToDecrease) {
        amountOfFood -= amountToDecrease;
    }

    public static int getAmountOfFood() {
        return amountOfFood;
    }
}

