package chapter4;

import chapter2.Point;

public abstract class Shape {

    protected Point p;

    public void moveBy(double dx, double dy) {
        p = p.translate(dx, dy);
    }

    public abstract Point getCenter();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
