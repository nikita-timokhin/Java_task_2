package chapter3;

public class MeasurableOperations {

    public double average(Measurable[] objects){
        double aver = 0;
        for (int i = 0; i < objects.length;i++){
            aver += objects[i].getMeasure();
        }
        return aver / objects.length;
    }
    public Measurable largest(Measurable[] objects){
        int max = 0;
        for (int i = 0; i < objects.length;i++){
            if (objects[i].getMeasure() > max){
                max = i;
            }
        }
        return objects[max];
    }
}
