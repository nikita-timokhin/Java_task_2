import chapter1.*;
import chapter2.Car;
import chapter2.Point;
import chapter3.Employee;
import chapter3.Measurable;
import chapter3.MeasurableOperations;
import chapter4.Circle;
import chapter4.Line;
import chapter4.Rectangle;
import chapter4.Shape;

public class Main {


    public static void main(String[] args) {

        System.out.println("Task 1.1, Enter the number");
        Numbers num = new Numbers();
        System.out.println(num.binary());

        System.out.println("Task 1.2, Enter the angle");
        Angle ang = new Angle();
        System.out.println(ang.normalise());
        System.out.println(ang.norm());

        System.out.println("Task 1.3, Enter three numbers");
        Comparison compar = new Comparison();
        System.out.println(compar.conditional());
        System.out.println(compar.usingMath() + " Using Math");

        System.out.println("Task 1.4");
        SmallestLargest a = new SmallestLargest();
        System.out.println(a);

        System.out.println("Task 1.6, Factorial");
        Factorial thousand = new Factorial();
        System.out.println(thousand.compute(1000));

        System.out.println("Task 1.13, Lottery");
        Lottery sixnumber = new Lottery();
        System.out.println(sixnumber.combination());

        System.out.println("Task 2.5, Immutable point");
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p);

        System.out.println("Task 2.9, Immutable car");
        Car toyota = new Car();
        toyota.move(100, 10);
        System.out.println(toyota.currentDistance());
        toyota.move(500, 30);
        toyota.refueling(40);
        System.out.println(toyota);


        System.out.println("Task 3.1, Average salary");
        Employee[] managers = new Employee[3];
        managers[0] = new Employee(1, 10000, "Bruce", "Willis");
        managers[1] = new Employee(2, 20000, "Mila", "Jovovich");
        managers[2] = new Employee(3, 30000, "Gary", "Oldman");
        MeasurableOperations aver = new MeasurableOperations();
        System.out.println(aver.average(managers));
        System.out.println("Task 3.2, Largest salary");
        System.out.println(((Employee) aver.largest(managers)).getFirstName());

        System.out.println("Task 4.4, Abstract class");
        Shape n = new Line(new Point(4, 4), new Point(5, 5));
        System.out.println(n.getCenter());
        n.moveBy(1, 1);
        System.out.println(n.getCenter());

        try {
            Circle cir = new Circle(new Point(1,1),10);
            System.out.println(cir.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }


}
