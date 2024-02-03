package Lesson_5_Animal;
/*
Создать классы Собака и Кот с наследованием от класса Животное.
Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
Добавить подсчет созданных котов, собак и животных.
Расширить задачу, добавив для котов возможность кушать из миски, выполнив следующие пункты:
Сделать так, чтобы в миске с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
Считаем, что если коту мало еды в миске, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
Создать массив котов и миску с едой, попросить всех котов покушать из этой миски и потом вывести информацию о сытости котов в консоль.
Добавить метод, с помощью которого можно было бы добавлять еду в миску.
 */

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Cat1", 200, 0,5);
        animals[1] = new Cat("Cat2", 200, 0,10);
        animals[2] = new Dog("Dog1", 500, 10,15);
        animals[3] = new Dog("Dog2", 500, 10,20);
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        System.out.println();
        System.out.println("Сats created: " + Cat.getCount());
        System.out.println("Dogs created: " + Dog.getCount());
        System.out.println("Total animals created: " + Animal.getCount());

        System.out.println();
        System.out.println("Run: ");
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(300);
        }

        System.out.println();
        System.out.println("Swim: ");
        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(10);
        }

        System.out.println();
        Food food = new Food();
        System.out.println("AmountOfFood: " + Food.getAmountOfFood());

        System.out.println();
        for (Animal animal : animals) {
            animal.eatFood(food);
        }

        System.out.println();
        for (Animal animal : animals) {
            animal.satietyInfo();
        }

    }
}


