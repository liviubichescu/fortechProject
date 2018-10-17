package temaOOP1;

public class Circle extends Shape{

    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of a circle.
     * @return The calculated area.
     */
    public double getArea(){
        return Math.PI * (this.radius * this.radius);
    }

    /**
     * Calculates the length(perimeter) of a circle.
     * @return The calculated perimeter.
     */
    public double getPerimeter(){
        return (2 * Math.PI) * this.radius;
    }

    @Override
    public String toString() {
        return "A circle with radius = " + radius + " which is a subclass of "+ super.toString();
    }
}
