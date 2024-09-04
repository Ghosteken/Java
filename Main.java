public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Upcasting
        Animal animal2 = new Cat(); // Upcasting

        animal1.makeSound(); // Output: "Dog barks"
        animal2.makeSound(); // Output: "Cat meows"
    }
}