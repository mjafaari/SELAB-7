package models;

public class Circle extends Figure{
    private double radius;
    private static double pi = 3.1416;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double computeArea() {
        return radius * radius * pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
