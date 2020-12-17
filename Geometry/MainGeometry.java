package Geometry;

public class MainGeometry {
    private double width;
    private double length;
    private double radius;

    public MainGeometry() {
    }

    public MainGeometry(double radius) {
        this.radius = radius;
    }

    public MainGeometry(double width, double length) {
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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }
}
