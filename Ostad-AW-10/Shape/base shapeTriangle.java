// Subclass Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing Triangle");
        // Drawing logic for Triangle
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height; // Area of a triangle = 0.5 * base * height
    }
}