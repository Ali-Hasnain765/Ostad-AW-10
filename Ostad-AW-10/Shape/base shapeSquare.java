// Subclass Square
class Square extends Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    void draw() {
        System.out.println("Drawing Square");
        // Drawing logic for Square
    }

    @Override
    double calculateArea() {
        return side * side; // Area of a square = side * side
    }
}