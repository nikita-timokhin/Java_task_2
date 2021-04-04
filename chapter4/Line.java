package chapter4;

import chapter2.Point;

public class Line extends Shape implements Cloneable {

    private Point t;


    public Line(Point from, Point to) {
        this.p = from;
        this.t = to;
    }

    @Override
    public Point getCenter() {
        Point center = new Point((this.p.getX() + this.t.getX()) / 2, (this.p.getY() + this.t.getY()) / 2);
        return center;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
