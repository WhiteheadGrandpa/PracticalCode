public class CarPort {

    // Attributes
    String make = "Honda Accord";
    String model = "Japanese";
    int year = 2009;
    String colour = "Black";
    double price = 150000.0;

    // Methods
    void drive() {
        System.out.println("Ademola is driving the car.");
    }

    void brake() {
        System.out.println("Ademola is stepping on the brake.");
    }

    public static void main(String[] args) {
        // Create an instance of CarPort
        CarPort myCar = new CarPort();

        // Display the attributes
        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
        System.out.println("Colour: " + myCar.colour);
        System.out.println("Price: " + myCar.price);

        // Call the methods
        myCar.drive();
        myCar.brake();
    }
}
