public class Perso {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public Perso(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}
