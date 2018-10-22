package ro.fortech.oop1.homeWork.shape;

/**
 * The class {@code Shape} represents a geometrical shape.
 */
public class Shape {
    private String color;
    private boolean filled;

    /**
     * Constructor for a shape with no-arguments  that initializes the color to "green" and filled to true
     */
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    /**
     * Constructor for a shape that initializes the color and filled to the given values.
     *
     * @param color  the initial value of shape color
     * @param filled the initial value of filled
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Getter for shape color
     *
     * @return the shape color
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter for shape color
     *
     * @param color the color to be set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter for filled shape
     *
     * @return filled shape(if the shape is filled or not)
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Setter for filled shape
     *
     * @param filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        String result = "";
        return "A Shape with color of " + color
                + (result = isFilled() ? " and filled." : " and not filled.");
    }


}
