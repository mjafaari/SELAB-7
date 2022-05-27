package models;

public class Circle extends Figure{
    private double radius;
    private static double pi = 3.1416;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double computeArea() {
        return 1;
    }

    public double getRadius() {
        return 1;
    }

    public void setRadius(double radius) {
        return;
    }
}
