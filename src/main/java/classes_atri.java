// class Car
class Car {
    // Attributes
    String brand;
    String model;
    int year;

    // constructor
    Car() {
    }

    // methods
    public void run() {
        System.out.println("Car is running");
    }

    public void breaks() {
        System.out.println("Car is breaking");
    }

    String getSpeed() {
        return "60kmph";
    }
}

public class classes_atri {
    public static void main(String args[]) {
        // creating an object of class
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2020;

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.model = "Civic";
        car2.year = 2019;

        System.out.println("Car 1: " + car1.brand + " " + car1.model + " " + car1.year);
        System.out.println("Car 2: " + car2.brand + " " + car2.model + " " + car2.year);
        car1.run();
        car1.breaks();
    }
}