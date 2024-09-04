public class MainShape {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        Triangle triangle = new Triangle(3.0, 8.0);
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
