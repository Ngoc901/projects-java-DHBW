package ProgrammingPractice;

public class Car {
    String make;
    String model;
    int year;
    String color;
    double price;


    Car(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }
    void drive(){
        System.out.println("Driving a " + this.make);
    }

    void brake(){
        System.out.println("Stepping on the brake");
    }
}
