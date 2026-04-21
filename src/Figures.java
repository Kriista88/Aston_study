package Homework4;

interface Figure {
    double getPerimeter();
    double getArea();

    default void printCharacteristics(String colorFill, String colorBorder) {
        // Округляем до 2 знаков после запятой
        System.out.printf("Периметр: %.2f%n", getPerimeter());
        System.out.printf("Площадь: %.2f%n", getArea());
        System.out.println("Цвет заливки: " + colorFill);
        System.out.println("Цвет границы: " + colorBorder);
    }
}

class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Triangle implements Figure {
    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}

public class Figures {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("=== КРУГ ===");
        circle.printCharacteristics("Желтый", "Черный");

        System.out.println("\n=== ПРЯМОУГОЛЬНИК ===");
        rectangle.printCharacteristics("Синий", "Красный");

        System.out.println("\n=== ТРЕУГОЛЬНИК ===");
        triangle.printCharacteristics("Зеленый", "Оранжевый");
    }
}