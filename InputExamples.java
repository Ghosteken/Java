import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputExamples {
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

    // Save the information to a file
    try {
        FileWriter fileWriter = new FileWriter("output.txt");
        fileWriter.write("Name: " + name + "\n");
        fileWriter.write("Age: " + age + "\n");
        fileWriter.write("Salary: " + salary + "\n");
        fileWriter.close();
        System.out.println("Data saved to output.txt");
    } catch (IOException e) {
        System.out.println("An error occurred while saving the data to the file.");
        e.printStackTrace();
    }
}
}
