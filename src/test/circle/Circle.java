package test.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
// Làm thêm (ngoài để bài yêu cầu)
    public Circle(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "Color of Circle is " + getColor() + "\n" + "Radius of Circle " + getRadius() + "\n" + "This Area of Circle " + getArea() + "\n" + "This Perimeter of Circle " + getPerimeter();
    }
}
