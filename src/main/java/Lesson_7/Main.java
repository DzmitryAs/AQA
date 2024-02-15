package Lesson_7;

public class Main {
    public static void main(String[] args) {
        int result = 0;

        String[][] array = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"9", "8", "7", "6"}, {"5", "4", "3", "2"}};
        String[][] error_array = {{"1", "2", "3", "4", "1"}, {"1", "2", "3", "4"}, {"9", "8", "7", "6"}, {"5", "4", "3", "2"}};
        String[][] error_data = {{"1", "1", "3", "4",}, {"1", "2", "3", "4"}, {"9", "8", "7", "6"}, {"5", "4", "3", "2t"}};

        System.out.println("Checking an array with a correct size:");
        try {
            result = analyze(array);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Quantity of array elements - " + result);
            System.out.println("");
        }

        System.out.println("Checking an array with an incorrect size:");
        try {
            result = 0;
            result = analyze(error_array);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Quantity of array elements - " + result);
            System.out.println("");
        }

        System.out.println("Checking an array with an incorrect data type:");
        try {
            result = 0;
            result = analyze(error_data);
        } catch(MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Quantity of array elements - "+ result);
        }
    }

    public static int analyze(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (array.length != 4 || array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4) {
            throw new MyArraySizeException();
        } else {
            System.out.println("Array size is correct");
        }

        for (int i = 1; i < 5; i++) {
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
