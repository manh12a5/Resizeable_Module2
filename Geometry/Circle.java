package Geometry;

import Resizeable.Resizeable;

public class Circle extends MainGeometry implements Resizeable {

    public Circle() {
    }

    public Circle(double radius) {
        super(radius);
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public double resize(double percent) {
        return 30.0;
    }

}
