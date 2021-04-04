package chapter2;

import chapter3.Employee;

public final class Point implements Cloneable {

    private final double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y) {
        return new Point(this.x + x, this.y + y);
    }

    public Point scale(double s) {
        return new Point(this.x * s, this.y * s);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
