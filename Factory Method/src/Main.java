public class Main {
    public static void main(String[] args) {
        ShapeFactory factory1 = new CircleFactory();
        Shape circle = factory1.createShape();
        circle.draw();

        ShapeFactory factory2 = new RectangleFactory();
        Shape rectangle = factory2.createShape();
        rectangle.draw();

        ShapeFactory factory3 = new TriangleFactory();
        Shape triangle = factory3.createShape();
        triangle.draw();

        // Create a Square using the new factory
        ShapeFactory factory4 = new SquareFactory();
        Shape square = factory4.createShape();
        square.draw();
    }
}