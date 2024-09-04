import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Read a string input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Read an integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Read a floating-point number input
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Print the input values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        // Close the scanner
        scanner.close();
    }
}
