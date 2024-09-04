public class Circle {
    private double radius;
 
    public Circle(double radius) {
        this.radius = radius;
    }
 
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

 
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
 
    public static void main(String[] args) {
        // Create an instance of Circle
        Circle circle = new Circle(5.0);
 
        // Calculate and print the area
        double area = circle.calculateArea();
        System.out.println("Area: " + area);
 
        // Modify the radius
        circle.radius = 7.0;
 
        // Calculate and print the circumference
        double circumference = circle.calculateCircumference();
        System.out.println("Circumference: " + circumference);
    }
}


