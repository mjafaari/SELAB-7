package models;

public class Rectangle extends Figure{
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    public double computeArea() {
        return width * length;
    }
}
