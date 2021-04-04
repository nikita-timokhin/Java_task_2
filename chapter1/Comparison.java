package chapter1;

import java.util.Scanner;

public class Comparison {

    Scanner in = new Scanner(System.in);
    private final int number1 = in.nextInt();
    private final int number2 = in.nextInt();
    private final int number3 = in.nextInt();

    public int conditional() {
        if (number1 > number2 && number1 > number3) {
            return number1;
        }
        return Math.max(number2, number3);
    }

    public int usingMath(){
        return Math.max(Math.max(number1,number2),number3);

    }



}
