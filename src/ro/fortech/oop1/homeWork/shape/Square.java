package ro.fortech.oop1.homeWork.shape;

/**
 * Am decis sa nu suprascriu the "getArea()" and "getPerimeter()" methods
 * intrucat eu cred ca din punct de vedere al relatiei de mostenire(care incalca LSP) nu este nevoie.
 * O suprascriere a unei metode care face exact acelasi lucru ca si metoda de baza consider a fi cod repetitiv.
 * #Less is more! #CLEAN CODE!
 */


/**
 * The class {@code Square} represents a geometric form of the shape of a square.
 */
public class Square extends Rectangle {

    /**
     * No-arg constructor that calls instance variables width and length from its superclass Rectangle.
     */
    private Square() {
        super();
    }

    /**
     * The constructor initialises the side parameter with the given value.
     * Side parameter initialises the instance variables width and length from its superclass Rectangle.
     * @param side the initial value of square side.
     */
    private Square(double side) {
        super(side, side);
        side = side;
    }

    /**
     * The constructor initialises the side, color and filled parameter with the given value.
     * Side parameter initialises the instance variables width and length from its superclass Rectangle.
     * @param side
     * @param color
     * @param filled
     */
    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
}