public class Main {
    public static void main(String[] args) {
        // Create individual shapes
        Shape circle = new Circle();
        Shape square = new Square();

        // Create a composite shape
        Composite composite = new Composite();
        composite.addShape(circle);
        composite.addShape(square);

        // Draw individual shapes
        System.out.println("Drawing individual shapes:");
        circle.draw();
        square.draw();

        // Draw the composite shape, which contains the individual shapes
        System.out.println("\nDrawing the composite shape:");
        composite.draw();
    }
}
