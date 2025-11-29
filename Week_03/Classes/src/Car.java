public class Car {

    // fields
    String make;
    String model;
    int year;

    // constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // method
    void drive() {
        System.out.println("The " + year + " " + make + " " + model + " is driving!" );
    }

}
