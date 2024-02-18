package Lesson_9_WorkWithTheCollection;

import java.util.Arrays;
import java.util.List;

public class WorkWithTheCollection {
    /*
    2. Задана коллекция, состоящая из строк: «Highload», «High», «Load», «Highload». Нужно с ней выполнить следующие манипуляции:
    2.1. Посчитать, сколько раз объект «High» встречается в коллекции;
    2.2. Определить, какой элемент в коллекции находится на первом месте. Если мы получили пустую коллекцию, то пусть возвращается 0;
    2.3. Необходимо вернуть последний элемент, если получили пустую коллекцию, то пусть возвращается 0.
     */

    public static void main(String[] args) {
        List<String> collection = Arrays.asList("Highload", "High", "Load", "Highload");

        //сколько раз "High" встречается в коллекции
        long count = collection.stream()
                .filter(str -> str.contains("High"))
                .count();
        System.out.println("Number of elements with object - High: " + count);

        //элемент в коллекции на первом месте
        String firstElement = collection.stream()
                .findFirst()
                .orElse("0");
        System.out.println("First element: " + firstElement);

        //элемент в коллекции на последнем месте
        String lastElement = collection.stream()
                .skip(collection.size() - 1)
                .findAny().
                orElse("0");
        System.out.println("Последний элемент коллекции: " + lastElement);
    }
}

