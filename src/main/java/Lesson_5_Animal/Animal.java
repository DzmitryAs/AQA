package Lesson_5_Animal;

public class Animal {
    protected String name;
    protected int run;
    protected int swim;
    private static int animalCount;
    protected int food;
    private boolean satiety = false;
    private int needToEat;


    public Animal() {
        animalCount++;
    }

    public static int getCount() {
        return animalCount;
    }

    public String toString() {
        return "Name: " + name + ", can run-" + run + "m." + ", can swim-" + swim + "м.";
    }

    protected void run(int distance) {
        if (run >= distance) {
            System.out.println(this.name + " - run " + distance + "m.");
        } else {
            System.out.println(this.name + " - didn't run the distance " + distance + "m.");
        }
    }

    protected void swim(int distance) {
        if (swim >= distance) {
            System.out.println(this.name + " - swim " + distance + "m.");
        } else {
            System.out.println(this.name + " - didn't swim the distance " + distance + "m.");
        }
    }

    public void eatFood(Food food) {
        if (satiety)
            System.out.println(this.name + " not hungry");
        else if (food.getAmountOfFood() >= needToEat && !satiety) {
            food.decreaseAmountOfFood(needToEat);
            satiety = true;
            System.out.println(this.name + " ate "
                    + needToEat + "g.");
        } else
            System.out.println(this.name + " didn't eat because he didn't have enough ");
    }

    public void satietyInfo() {
        if (satiety) System.out.println(this.name + " full of food");
        else System.out.println(this.name + " didn't eat");
    }
}



