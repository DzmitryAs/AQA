public class Lesson_2 {
    public static void main(String[] args) {
        printThreeWords("");
        checkSumSign(10,-15);
        printColor(100);
        compareNumbers(5,7);
    }
    public static void printThreeWords(String s) {
        System.out.println("1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три " +
                "слова: Orange, Banana, Apple.");
        System.out.println("Orange\nBanana\nApple " + s);
        System.out.println();
    }

    public static void checkSumSign(int a, int b) {
        System.out.println("Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и " +
                "инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти " +
                "переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, " +
                "в противном случае - “Сумма отрицательная");
        if (a+b>=0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println();
    }

    public static void printColor(int value) {
        System.out.println("3. Создайте метод printColor() в теле которого задайте int переменную value и " +
                "инициализируйте ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен " +
                "вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), " +
                "то “Желтый”, если больше 100 (100 исключительно) - “Зеленый");
        if (value<=0) {
            System.out.println("Красный");
        }
        else if (value<=100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
        System.out.println();
    }

    public static void  compareNumbers(int a, int b) {
        System.out.println("4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и " +
                "инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо " +
                "вывести в консоль сообщение “a >= b”, в противном случае “a < b");
        if (a>=b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}
