package temaOOP1;

/**
 * @author
 *
 */
public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        String result = "";
        return "A Shape with color of " + color
                + (result = isFilled() ? " and filled." : " and not filled.");
    }

    public static void main(String[] args) {

        Shape shape = new Shape("yellow", false);
        System.out.println(shape.toString());

        Circle circle = new Circle("blue",false, 25);
        System.out.println(circle.toString());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Rectangle rectangle = new Rectangle("gray",true, 10,10);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Square square = new Square(5,"dark", true);
        System.out.println(square.toString());
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());

    }

}
