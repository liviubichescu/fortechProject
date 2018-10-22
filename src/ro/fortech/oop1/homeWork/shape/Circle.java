package ro.fortech.oop1.homeWork.shape;

/**
 * The class {@code Circle} represents a geometric form of the shape of a circle.
 */
public class Circle extends Shape {

    private double radius;

    /**
     * No-arg constructor that initializes the radius to 1.0.
     */
    private Circle() {
        this.radius = 1.0;
    }

    /**
     * Constructor that initializes the radius field
     *
     * @param radius the initial value of circle radius
     */
    private Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor that initializes the radius, color and filled fields.
     *
     * @param color  initial value of circle color
     * @param filled the initial value of filled
     * @param radius the initial value of circle radius
     */
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Getter for radius
     *
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Setter for radius
     *
     * @param radius the radius to be set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of a circle.
     *
     * @return The calculated area.
     */
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    /**
     * Calculates the length(perimeter) of a circle.
     *
     * @return The calculated perimeter.
     */
    public double getPerimeter() {
        return (2 * Math.PI) * this.radius;
    }

    @Override
    public String toString() {
        return "A circle with radius = " + radius + " which is a subclass of " + super.toString();
    }
}
