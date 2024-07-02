// Subclass Circle
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
        // Drawing logic for Circle
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius; // Area of a circle = π * r^2
    }
}
