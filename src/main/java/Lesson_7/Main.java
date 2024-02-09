package Lesson_7;

import Lesson_8.MyArrayDataException;
import Lesson_8.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        int result = 0;

        String[][] array = {{"4", "3", "2", "1"}, {"1", "2", "3", "4"}};
        String[][] error_array = {{"5", "4", "3", "2", "1"}, {"1", "2", "3", "4"}};
        String[][] error_data = {{"5", "6", "7", "8",}, {"w","2", "1", "0"}};

        System.out.println("Checking an array with a correct size:");
        try {
            result = analyze(array);
        } catch (Lesson_8.MyArraySizeException | Lesson_8.MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Quantity of array elements - " + result);
            System.out.println("");
        }

        System.out.println("Checking an array with an incorrect size:");
        try {
            result = 0;
            result = analyze(error_array);
        } catch (Lesson_8.MyArraySizeException | Lesson_8.MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Quantity of array elements - " + result);
            System.out.println("");
        }

        System.out.println("Checking an array with an incorrect data type:");
        try {
            result = 0;
            result = analyze(error_data);
        } catch (Lesson_8.MyArraySizeException | Lesson_8.MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Quantity of array elements - " + result);
            System.out.println("");
        }
    }

    public static int analyze(String[][] array) throws Lesson_8.MyArraySizeException, Lesson_8.MyArrayDataException {
        int sum = 0;

        if (array.length != 2 || array[0].length != 4 || array[1].length != 4) {
            throw new MyArraySizeException();
        } else {
            System.out.println("Array length is correct");
        }

        for (int i = 1; i < 3; i++) {
            for (int c = 1; c < 5; c++) {
                try {
                    sum += Integer.parseInt(array[i - 1][c - 1]);
                } catch (NumberFormatException e) {
                    String message = "in " + i + " row, " + c + " cell";
                    throw new MyArrayDataException(message);
                }
            }
        }
        return sum;
    }
}