package test.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Information of Circle 1: ");
        System.out.println(circle1);

        Circle circle2 = new Circle();
        circle2.setRadius(30);
        circle2.setColor("Blue");
        System.out.println("Information of Circle 2: ");
        System.out.println(circle2);
    }
}
