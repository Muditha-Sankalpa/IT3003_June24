class Product {
    String brand;
    double price;

    // Constructor 1: Without parameters
    Product() {
        System.out.println(" No-argument constructor called. Initializing default product...");
        this.brand = "Unknown";
        this.price = 0.0;
    }

    // Constructor 2: With brand and price parameters
    Product(String brand, double price) {
        System.out.println("Parameterized constructor called. Setting custom brand & price...");
        this.brand = brand;
        this.price = price;
    }
}