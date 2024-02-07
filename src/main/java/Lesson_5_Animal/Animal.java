package Lesson_5_Animal;

public class Animal {
    private static int animalCount;
    public Animal() {
        animalCount++;
    }

    public static void printQuantityOfAnimals() {
        System.out.println();
        System.out.println("Animal created - " + animalCount);
    }

    public void run (int runLimit) {
        System.out.println();
    }

    public void swim (int swimLimit) {
        System.out.println();
    }


}


