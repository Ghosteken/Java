class Animal9 {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Cat extends Animal9 {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}



