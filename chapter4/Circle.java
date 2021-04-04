package chapter4;

import chapter2.Point;

public class Circle extends Shape implements Cloneable{
    private double radius;

    public Circle(Point center, double radius) {
        this.p = center;
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return this.p;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", p=" + p +
                '}';
    }

}

