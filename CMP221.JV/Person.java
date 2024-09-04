public class Person {
    private String name;
    private int age;

    // Constructor with parameters
    public Person(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

    // Method to display the details of the person
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Usage:
Person person1 = new Person("John Doe", 30);
person1.displayDetails();
