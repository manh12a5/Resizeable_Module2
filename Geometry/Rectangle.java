package Geometry;

import Resizeable.Resizeable;

public class Rectangle extends MainGeometry implements Resizeable {

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        super(width, length);
    }

    public double getArea() {
        return getLength() * getWidth();
    }

    public double getPerimeter() {
        return 2 * (getLength() + getWidth());

    }
    @Override
    public double resize(double percent) {
        return 60.0;
    }
}
