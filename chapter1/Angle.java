package chapter1;

import java.util.Scanner;

public class Angle {
    Scanner in = new Scanner(System.in);
    private int angle = in.nextInt();

    public int normalise() {
        angle = angle % 360;
        if (angle < 0) {
            angle = angle + 360;
        }
        return angle;
    }

    public int norm() {
        angle = Math.floorMod(angle, 360);
        if (angle < 0) {
            angle = angle + 360;
        }
        return angle;
    }
}



