public class Mainv {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car();

        // Access attributes from the parent class
        myCar.brand = "Toyota";

        // Access attributes and methods specific to the Car class
        myCar.model = "Corolla";
        myCar.display();

        // Access the inherited method from the Vehicle class
        myCar.honk();
    }
}

