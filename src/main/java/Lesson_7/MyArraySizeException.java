package Lesson_7;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Array size is not correct!");
    }
}
