public class Main {
    public static void main(String[] args) {
        // Create an instance of the existing class
        LegacyRectangle legacyRectangle = new LegacyRectangle();

        // Create an adapter to use the existing class with the new interface
        NewShape newShapeAdapter = new LegacyRectangleAdapter(legacyRectangle);

        // Use the new class with the adapted method
        newShapeAdapter.draw(10, 20, 30, 40);
    }
}
