package test.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Information of Circle 1: ");
        System.out.println(circle1);

        Circle circle2 = new Circle(4);
        circle2.setColor("Blue");
        System.out.println("Information of Circle 2: ");
        System.out.println(circle2);

        Circle circle3 = new Circle(8, "Yellow");
        System.out.println("Information of Circle 3: ");
        System.out.println(circle3);
    }
}
