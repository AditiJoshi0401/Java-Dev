// class Car
class Car {

    // Attributes
    // instant variables
    private String brand;
    private String model;
    private int year;
    private int speed;

    void setBrand(String brand){
        this.brand= brand;
    }

    void setModel(String model){
        this.model= model;
    }

    String getBrand(){
        return this.brand;
    }

    String getModel(){
        return this.model;
    }


    // static variable
    static int numberOfCarsBuild = 0;
    static int numberOfRunningCars = 0;
    // default constructor

    Car(){
        brand = "Unknown";
        model = "Unknown";
        year = 0;
        numberOfCarsBuild++;
    }    

    // parameterized constructor
    Car(String br, String mo, int yr){
        brand = br;
        model = mo;
        year = yr;
        speed = 0;
        numberOfCarsBuild++;
    }

    // parameterized constructor with only year
    Car( int yr){
        year = yr;
        numberOfCarsBuild++;
    }

    // methods

    public void run(){
        System.out.println("Car is running");
        numberOfRunningCars++;
    }

    public void breaks(){
        System.out.println("Car is breaking");
        if (numberOfRunningCars > 0)
            numberOfRunningCars--;
    }

    String getSpeed(){
        return speed + "Kmph";
    }

    void increaseSpeed(int speed){
        if (speed >=0 && speed < 100) // check helps you to control the variable value.
            this.speed = speed;
        System.out.println("Increased Speed is "+ this.getSpeed());
    }

    boolean isMyCarYounger(Car c){
        return this.year > c.year;
    }
}

public class classes {

    // void printCarDetailsWithTruckDetails(Car c, Truck t){
    //     // print the details.
    // }

    public static void main(String args[]){

        // creating an object of class
        Car car1 = new Car();
        System.out.println("Car 1: "+car1.getBrand()+" "+car1.getModel()+" "+car1.getYear()+" "+Car.numberOfCarsBuild);        

        Car car2 = new Car();
        System.out.println("Car 2: "+car2.brand+" "+car2.model+" "+car2.year+" "+Car.numberOfCarsBuild);

        Car car3 = new Car("Honda", "Civic", 2021);
        System.out.println("Car 3: "+car3.brand+" "+car3.model+" "+car3.year+" "+Car.numberOfCarsBuild);


        car1.run();  // +1
        car2.run();  // 2
        System.out.println("Number of running cars: "+Car.numberOfRunningCars);
        car3.run(); //3
        car1.breaks(); // 2
        System.out.println("Number of running cars: "+Car.numberOfRunningCars);

        if(car1.isMyCarYounger(car3)){
            System.out.println("car1 is younger than car3");
        }else{
            System.out.println("Car 3 is younger to car1");
        }

    }
}
