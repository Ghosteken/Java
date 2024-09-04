public class Main2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
     
        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();
     
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}



