package Lesson_5_Figure;
/*
Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур: круг, прямоугольник, треугольник.
Задать для каждой фигуры цвет заливки и цвет границы.
Результат полученных характеристик [ Периметр, площадь, цвет фона, цвет границ ] по каждой фигуре вывести в консоль.
Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в качестве дефолтных методов в интерфейсе.
 */

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10, "Yellow", "Blue");
        circle.info();

        Rectangle rectangle = new Rectangle(4, 6, "White", "Black");
        rectangle.info();

        Triangle triangle = new Triangle(2, 2, 3, "Orange", "Brown");
        triangle.info();
    }
}

