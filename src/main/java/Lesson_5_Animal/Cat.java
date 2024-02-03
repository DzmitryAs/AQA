package Lesson_5_Animal;

public class Cat extends Animal {
    private static int catCount;

    public Cat(String name, int run, int swim, int food) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        catCount++;
    }

    public static int getCount() {
        return catCount;
    }
}






