package ro.fortech.oop1.homeWork.shape;

/**
 * The class {@code Rectangle} represents a geometric form of the shape of a rectangle.
 */
public class Rectangle extends Shape {

    private double width;
    private double length;

    /**
     * No-arg constructor that initializes the length and width to 1.0.
     */
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    /**
     * Constructor for a rectangle that initializes the width and length to the given values
     *
     * @param width  the initial value of rectangle width
     * @param length the initial value of rectangle length
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor that initializes the color, filled, width and length fields.
     *
     * @param color  initial value of rectangle color
     * @param filled initial value of rectangle filled
     * @param width  initial value of rectangle width
     * @param length initial value of rectangle length
     */
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates the area of a rectangle.
     *
     * @return The calculated area.
     */
    public double getArea() {
        return this.length * this.width;
    }

    /**
     * Calculates the perimeter of a rectangle.
     *
     * @return The calculated perimeter.
     */
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + this.width +
                " and length = " + this.length +
                " which is a subclass of " + super.toString();
    }
}
