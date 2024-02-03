package Lesson_5_Figure;

public class Circle implements Calculation {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void info() {
        System.out.println("Circle perimeter : " + calculatePerimeter());
        System.out.println("Circle area  : " + calculateArea());
        System.out.println("Fill color : " + fillColor);
        System.out.println("BorderColor : " + borderColor);
        System.out.println();
    }
}

