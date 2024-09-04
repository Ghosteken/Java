public class Mainp {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
