package chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lottery {

    private final int capacity = 49;
    private final ArrayList lot = new ArrayList(capacity);

    public Lottery() {
        for (int i = 1; i < 51; i++) {
            lot.add(i);
        }
    }

    @Override
    public String toString() {
        return "Lottery{" +
                "lot=" + lot +
                '}';
    }

    public ArrayList combination() {
        ArrayList res = new ArrayList(6);
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            res.add(lot.remove((r.nextInt(50 - i))));
        }
        Collections.sort(res);
        return res;
    }
}
