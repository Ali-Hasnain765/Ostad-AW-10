public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        Shape square = new Square(4.0);
        square.draw();
        System.out.println("Area of Square: " + square.calculateArea());

        Shape triangle = new Triangle(3.0, 4.0);
        triangle.draw();
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}