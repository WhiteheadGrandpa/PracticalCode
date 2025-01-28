public class Encaptulation {

    public static void main(String[] args) {
        Car car = new Car("Honda", "Japanese", 2002);
        System.out.println(car.getMake());
    }
}

class Car {

    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
