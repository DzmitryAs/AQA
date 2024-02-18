package Lesson_9_NumberOfEvenNumbersFromTheSet;

import java.util.Random;
import java.util.stream.IntStream;

public class Lesson_9_NumberOfEvenNumbersFromTheSet {
    /*
    1. Для любого набора случайно-сгенерированных чисел нужно определить количество чётных чисел.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int count = 10;

        long evenCount = IntStream.generate(() -> random.nextInt(20))
                .limit(count)
                .filter(number -> number % 2 == 0)
                .count();

        System.out.println("Number of even numbers: " + evenCount);
    }
}

