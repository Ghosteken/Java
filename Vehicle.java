// Parent class (superclass)
class Vehicle {
    
    String brand;
    
    void honk() {
        System.out.println("Beep beep!");
    }

}

// Child class (subclass) inheriting from Vehicle
class Car extends Vehicle {
    String model;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    
    }

}

