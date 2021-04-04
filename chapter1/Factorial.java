package chapter1;

import java.math.BigInteger;

public class Factorial {
    public BigInteger compute(int n) {
        BigInteger sum = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            BigInteger c = new BigInteger(Integer.toString(i));
            sum = sum.multiply(c);
        }
        return sum;
    }

}
