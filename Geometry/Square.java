package Geometry;

import Resizeable.Resizeable;

public class Square extends MainGeometry implements Resizeable {

    public Square() {
    }

    public Square(double radius) {
        super(radius);
    }

    public double getArea() {
        return getRadius() * getRadius();
    }

    public double getPerimeter() {
        return 4 * getRadius();
    }

    @Override
    public double resize(double percent) {
        return 90.0;
    }
}
