package Lesson_5_Animal;

public class Dog extends Animal {
    private static int dogCount;
    private String dogName;

    public Dog(String dogName) {
        super();
        dogCount++;
        this.dogName = dogName;
    }

    public static void printQuantityOfDogs() {
        System.out.println("Dog created - " + dogCount);
    }

    @Override
    public void run(int runLimit) {
        if (runLimit > 0 && runLimit <= 500) {
            System.out.println(this.dogName + " - ran " + runLimit + "m");
        }
        if (runLimit > 500)
            System.out.println(this.dogName + " - ran 200m and got tired");
    }

    @Override
    public void swim(int swimLimit) {
        if (swimLimit > 0 && swimLimit <= 10) {
            System.out.println(this.dogName + " - swam " + swimLimit + "m");
        }
        if (swimLimit > 10)
            System.out.println(this.dogName + " - swam 10m and got tired");
    }
}

