package ro.fortech.oop1.homeWork;

import ro.fortech.oop1.homeWork.shape.Circle;
import ro.fortech.oop1.homeWork.shape.Rectangle;
import ro.fortech.oop1.homeWork.shape.Shape;
import ro.fortech.oop1.homeWork.shape.Square;

public class Main {

    public static void main(String[] args) {

        Shape shape = new Shape("yellow", false);
        System.out.println("SHAPE");
        System.out.println(shape.toString());

        System.out.println();

        Circle circle = new Circle("blue", false, 25);
        System.out.println("CIRCLE");
        System.out.println(circle.toString());
        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The perimeter of the circle is: " + circle.getPerimeter());

        System.out.println();

        Rectangle rectangle = new Rectangle("gray", true, 10, 10);
        System.out.println("RECTANGLE");
        System.out.println(rectangle.toString());
        System.out.println("The area of the rectangle is: " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is: " + rectangle.getPerimeter());

        System.out.println();

        Square square = new Square(5, "dark", true);
        System.out.println("SQUARE");
        System.out.println(square.toString());
        System.out.println("The area of the square is: " + square.getArea());
        System.out.println("The perimeter of the square is: " + square.getPerimeter());

        Math math;

    }

}
