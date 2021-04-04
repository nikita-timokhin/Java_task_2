package chapter2;

public final class Car {

    private double fuelEfficiency, x, gas, distance;

    public void move(double miles, double gas) {
        this.x += miles;
        this.gas -= gas;
        this.fuelEfficiency = miles / gas;
        this.distance += Math.abs(miles);
    }

    public Car(double fuelEfficiency, double x, double gas) {
        this.fuelEfficiency = fuelEfficiency;
        this.x = x;
        this.gas = gas;
    }

    public Car() {
        this.fuelEfficiency = 0;
        this.x = 0;
        this.gas = 100;
        distance = 0;
    }

    public void refueling(double gas) {
        this.gas += gas;
    }

    public String currentDistance() {
        return "Current Distance: " + this.distance + " Remaining fuel: " + this.gas;
    }

    @Override
    public String toString() {
        return "Current Distance: " + this.distance + ", Remaining fuel: " + this.gas + ", Fuel efficiency: " + this.fuelEfficiency + ", Current position: " + this.x;
    }
}
