package chapter1;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Numbers {

    Scanner in = new Scanner(System.in);
    private final int number = in.nextInt();

    public Numbers() {
    }

    public String binary() {
        System.out.println("Binary:");
        return Integer.toBinaryString(number);
    }

    public String octal() {
        System.out.println("Octal:");
        return Integer.toOctalString(number);
    }

    public String hex() {
        System.out.println("Hexadecimal");
        return new BigInteger(Integer.toString(number)).toString(16);

    }

    public String reciprocal() {
        BigDecimal n = new BigDecimal(number);
        BigDecimal b = new BigDecimal(1);
        System.out.println("Reciprocal:");
        return Float.toHexString(b.divide(n, 5, BigDecimal.ROUND_UP).floatValue());

    }

}
