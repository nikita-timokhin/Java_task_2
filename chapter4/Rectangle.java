package chapter4;

import chapter2.Point;

public class Rectangle extends Shape implements Cloneable {

    private float length;
    private float width;


    public Rectangle(Point topLeft, float width, float length) {
        this.p = topLeft;
        this.width = width;
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getArea() {
        return this.length * this.width;
    }

    public float getPerimetr() {
        return this.length * 2 + this.width * 2;
    }

    public Point getCenter() {
       Point center = new Point((this.p.getX() + this.p.getX()+ this.width) / 2, (this.p.getY() + this.p.getY()+ this.length) / 2);
        return center;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
