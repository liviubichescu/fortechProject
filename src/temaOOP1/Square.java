package temaOOP1;

public class Square extends Rectangle{

    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
        side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }


    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    /**
     * I decided to override the the "getArea()" method because I believe it's a good practice considering the SOLID Principles especially the Liskov Substitution
     * Principle which basically says that any child type of a parent type should be able to stand in for that parent without things blowing up.
     * Also considering that it's a "single" @Override of the method getArea() it cannot be claimed that multiple implementations within an inheritance hierarchy
     * can lead to code that is hard to debug and that you have to be extremely careful to determine which version of such a method is actually called.
     *
     *
     * Calculates the area of a square.
     * @return The calculated area.
     */
    @Override
    public double getArea() {
        return getSide()* getSide();
    }

    @Override
    public double getPerimeter() {
        return 4*getSide();
    }


    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    public String toString()
    {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
}