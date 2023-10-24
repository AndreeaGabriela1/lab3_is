public class TriangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Triangle();
    }
}