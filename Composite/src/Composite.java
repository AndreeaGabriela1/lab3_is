import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape {
    private List<Shape> shapes = new ArrayList<>();
    public void addShape(Shape shape) {
        shapes.add(shape);
    }
    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Composite Shape");
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
