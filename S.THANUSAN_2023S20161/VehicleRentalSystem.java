abstract class Vehicle {
    private String vehicleNumber;
    private String brand;

    public Vehicle(String vehicleNumber, String brand) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }   
    public String getBrand() {
        return brand;
    }
    public abstract double calculateRent(int days);
    public void displayDetails(int days) {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Total Rent: " + calculateRent(days));
        System.out.println();
    }
}

class Car extends Vehicle {
    private static final double RENT_PER_DAY = 5000;

    public Car(String vehicleNumber, String brand) {
        super(vehicleNumber, brand);
    }

    public double calculateRent(int days) {
        return RENT_PER_DAY * days;
    }
}

class Bike extends Vehicle {
    private static final double RENT_PER_DAY = 2000;

    public Bike(String vehicleNumber, String brand) {
        super(vehicleNumber, brand);
    }

    public double calculateRent(int days) {
        return RENT_PER_DAY * days;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new Car("CAR101", "Toyota");
        Bike bike = new Bike("BIKE201", "Honda");        
        int rentalDays = 3;
        double carRent = car.calculateRent(rentalDays);
        double bikeRent = bike.calculateRent(rentalDays);

        System.out.println("Runtime Polymorphism");
        System.out.println("Car Rent: " + (int)carRent);
        System.out.println("Bike Rent: " + (int)bikeRent);
        System.out.println();
        System.out.println("Car Number: " + car.getVehicleNumber());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Total Rent: " + (int)carRent);
        System.out.println();
        System.out.println("Bike Number: " + bike.getVehicleNumber());
        System.out.println("Brand: " + bike.getBrand());
        System.out.println("Total Rent: " + (int)bikeRent);
        System.out.println();
        System.out.println("=== Using Parent Reference ===\n");
        Vehicle vehicleRef;
        
        vehicleRef = car;
        vehicleRef.displayDetails(rentalDays);
        
        vehicleRef = bike;
        vehicleRef.displayDetails(rentalDays);
    }
}