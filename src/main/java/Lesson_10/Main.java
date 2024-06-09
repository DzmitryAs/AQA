package Lesson_10;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple(), 2);

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruit(new Orange(), 2);

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());

        System.out.println("Weight of box with apples №1 : " + appleBox1.getWeight());
        System.out.println("Weight of box with apples №2 : " + appleBox2.getWeight());
        System.out.println("Weight of box with oranges №1 : " + orangeBox1.getWeight());
        System.out.println("Compare of apple box №1 and №2 : " + appleBox1.compare(appleBox2));
        System.out.println("Compare of a box of apples №1 and a box of oranges №1 : " + appleBox1.compare(orangeBox1));

        appleBox1.moveFruits(appleBox2);
        System.out.println("Weight of box of apples №1 after pouring : " + appleBox1.getWeight());
        System.out.println("Weight of box of apples No. 2 after pouring : " + appleBox2.getWeight());
    }
}
