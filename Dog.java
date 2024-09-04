public class Dog extends Mammal {
    public Dog(String name, int age) {
        super(name, age);
    }
//Polymorphism and escapulation methods
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
