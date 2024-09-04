class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
// polymorphism in Java
class Dog extends Animal {
    public Dog(String string, int i) {
    }

    public Dog() {
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}