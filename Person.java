public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        } else {
            System.out.println("Invalid age value. Age cannot be negative.");
        }
    }
}
//ESCAPULATION LEVEL