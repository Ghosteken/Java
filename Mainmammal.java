public class Mainmammal {
    public static void main(String[] args) {
        Mammal myMammal = new Mammal("Mammal", 5);
        Dog myDog = new Dog("Buddy", 2);

        myMammal.makeSound(); // Output: Mammal makes a sound
        myDog.makeSound(); // Output: Dog barks

        System.out.println("Mammal's name: " + myMammal.getName()); // Output```
    }
}
