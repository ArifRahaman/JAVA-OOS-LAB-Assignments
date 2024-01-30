package JAVAOOS;

class Automobile {
    private String make;
    private String type;
    private int maxSpeed;
    private double price;
    private double mileage;
    private String registrationNumber;

    public Automobile(String make, String type, int maxSpeed, double price, double mileage, String registrationNumber) {
        this.make = make;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.mileage = mileage;
        this.registrationNumber = registrationNumber;
    }

    // Reader methods
    public String getMake() {
        return make;
    }

    public String getType() {
        return type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public double getMileage() {
        return mileage;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    // Writer methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}

class Truck extends Automobile {
    private int capacity;
    private String hoodType;
    private int noOfWheels;

    public Truck(String make, String type, int maxSpeed, double price, double mileage, String registrationNumber,
                 int capacity, String hoodType, int noOfWheels) {
        super(make, type, maxSpeed, price, mileage, registrationNumber);
        this.capacity = capacity;
        this.hoodType = hoodType;
        this.noOfWheels = noOfWheels;
    }

    // Reader methods for Truck
    public int getCapacity() {
        return capacity;
    }

    public String getHoodType() {
        return hoodType;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    // Writer methods for Truck
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setHoodType(String hoodType) {
        this.hoodType = hoodType;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
}

class Car extends Automobile {
    private int noOfDoors;
    private int seatingCapacity;

    public Car(String make, String type, int maxSpeed, double price, double mileage, String registrationNumber,
               int noOfDoors, int seatingCapacity) {
        super(make, type, maxSpeed, price, mileage, registrationNumber);
        this.noOfDoors = noOfDoors;
        this.seatingCapacity = seatingCapacity;
    }

    // Reader methods for Car
    public int getNoOfDoors() {
        return noOfDoors;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    // Writer methods for Car
    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
}

public class q13 {
    public static void main(String[] args) {
        // Create a Truck object
        Truck truck = new Truck("Ford", "Truck", 120, 50000.0, 15.5, "TN1234", 5000, "Open", 8);

        // Create a Car object
        Car car = new Car("Toyota", "Sedan", 160, 30000.0, 20.5, "KA5678", 4, 5);

        // Display information about the Truck
        System.out.println("Truck Information:");
        System.out.println("Make: " + truck.getMake());
        System.out.println("Type: " + truck.getType());
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " km/h");
        System.out.println("Price: $" + truck.getPrice());
        System.out.println("Mileage: " + truck.getMileage() + " km/l");
        System.out.println("Registration Number: " + truck.getRegistrationNumber());
        System.out.println("Capacity: " + truck.getCapacity() + " kg");
        System.out.println("Hood Type: " + truck.getHoodType());
        System.out.println("Number of Wheels: " + truck.getNoOfWheels());

        // Display information about the Car
        System.out.println("\nCar Information:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Type: " + car.getType());
        System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h");
        System.out.println("Price: $" + car.getPrice());
        System.out.println("Mileage: " + car.getMileage() + " km/l");
        System.out.println("Registration Number: " + car.getRegistrationNumber());
        System.out.println("Number of Doors: " + car.getNoOfDoors());
        System.out.println("Seating Capacity: " + car.getSeatingCapacity());
    }
}

