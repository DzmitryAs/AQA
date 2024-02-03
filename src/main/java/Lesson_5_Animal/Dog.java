package Lesson_5_Animal;

public class Dog extends Animal {
    private static int dogCount;

    public Dog(String name, int run, int swim, int food) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.food = food;
        dogCount++;
    }

    public static int getCount() {
        return dogCount;
    }
}

