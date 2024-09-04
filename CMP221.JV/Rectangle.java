public class Rectangle {
    private int width;
    private int height;

    // Method to calculate the area of the rectangle
    public int calculateArea() {
        return width * height;
    }

    // Method to set the dimensions of the rectangle
    public void setDimensions(int newWidth, int newHeight) {
        width = newWidth;
        height = newHeight;
    }
}

// Usage:
Rectangle myRectangle = new Rectangle();
myRectangle.setDimensions(5, 3);
int area = myRectangle.calculateArea();
System.out.println("Area: " + area);
