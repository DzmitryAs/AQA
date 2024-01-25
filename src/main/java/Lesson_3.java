import java.util.Arrays;

public class Lesson_3 {
    public static void main(String[] args) {
        System.out.println("1. checkSum: " + checkSum(1, 1));
        checkNumber(2);
        System.out.println("3. checkMethod: " + checkMethod(5));
        printLine("Hello", 3);
        System.out.println("5. checkYear: " + checkYear(803));
        System.out.println("10. lenArr: " + Arrays.toString(lenArr(5, 7)));

        /*
        6. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0.
         */
        System.out.print("6. arrChange: ");
        int[] arrChange = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arrChange.length; i++) {
            if (arrChange[i] == 0) {
                arrChange[i] = 1;
            } else {
                arrChange[i] = 0;
            }
            System.out.print(arrChange[i] + " ");
        }
        System.out.println();

        /*
        7. Задать пустой целочисленный массив длиной 100.С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100.
         */
        System.out.print("7. arr100: ");
        int[] arr100 = new int[100];
        arr100[0] = 1;
        for (int i = 0; i < arr100.length; i++) {
            arr100[i] = i + 1;
            System.out.print(arr100[i] + " ");
        }
        System.out.println();

        /*
        8. Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] пройти по нему циклом, и числа меньше 6 умножить на 2.
         */
        System.out.print("8. arrayMultiplicative: ");
        int[] arrayMultiplicative = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int j = 0; j < arrayMultiplicative.length; j++) {
            if (arrayMultiplicative[j] < 6) {
                arrayMultiplicative[j] = arrayMultiplicative[j] * 2;
            }
            System.out.print(arrayMultiplicative[j] + "," + " ");
        }
        System.out.println();

        /*
        9. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
        заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы
        одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n]][n].
         */
        System.out.println("9. arrDiagonal: ");
        int[][] arrDiagonal = new int[5][5];
        for (int i = 0; i < arrDiagonal.length; i++) {
            arrDiagonal[i][i] = 1;
            arrDiagonal[i][arrDiagonal.length - i - 1] = 1;
        }
        for (int[] ints : arrDiagonal) {
            for (int j = 0; j < arrDiagonal.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    /*
    1. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до
    20(включительно), если да – вернуть true, в противном случае – false.
     */
    public static boolean checkSum(int a, int b) {
        return ((a + b) > 10 && (a + b) <= 20);
    }

    /*
    2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
    положительное ли число передали, или отрицательное. Замечание: ноль считаем положительным числом.
    */
    public static void checkNumber(int c) {
        System.out.print("2. checkNumber: ");
        if (c < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    /*
    3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
    отрицательное, и вернуть false если положительное.
     */
    public static boolean checkMethod(int d) {
        return d < 0;
    }

    /*
    4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
    указанную строку, указанное количество раз.
     */
    public static void printLine(String s, int g) {
        System.out.print("4. printLine: ");
        for (int i = 1; i <= g; i++)
            System.out.print(s + " ");
        System.out.println();
    }

    /*
    5. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не
    високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static boolean checkYear(int h) {
        return h % 4 == 0 && h % 100 != 0 || h % 400 == 0;
    }

    /*
    10. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
    длиной len, каждая ячейка которая равна initialValue.
      */
    public static int[] lenArr(int len, int initialValue) {
        int[] lenArr = new int[len];
        Arrays.fill(lenArr, initialValue);
        return lenArr;
    }
}







