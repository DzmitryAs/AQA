package Lesson_5_Animal;

public class Cat extends Animal {
    private static int catCount;
    private String catName;
    private boolean satiety = false;
    private int needToEat;

    public Cat(String catName, int needToEat) {
        super();
        this.catName = catName;
        this.needToEat = needToEat;
        catCount++;
    }

    @Override
    public void run(int runLimit) {
        if (runLimit > 0 && runLimit <= 200) {
            System.out.println(this.catName + " - ran " + runLimit + "m");
        }
        if (runLimit > 200)
            System.out.println(this.catName + " - ran 200m and got tired");
    }


    @Override
    public void swim(int swimLimit) {
        System.out.println();
        System.out.println("Cats - can't swim");
    }

    public static void printQuantityOfCats() {
        System.out.println("Cats created - " + catCount);
    }

    public void eatFood(Food food) {
        if (satiety)
            System.out.println(this.catName + " not hungry");
        else if (food.getAmountOfFood() >= needToEat) {
            food.decreaseAmountOfFood(needToEat);
            satiety = true;
            System.out.println(this.catName + " - ate "
                    + needToEat + "g");
        } else
            System.out.println(this.catName + " - didn't eat because he didn't have enough ");
    }

    public void satietyInfo() {
        if (satiety) System.out.println(this.catName + " - has eaten and is not hungry");
        else System.out.println(this.catName + " - hasn't eaten and wants to eat");
    }
}






