public class LegacyRectangleAdapter implements NewShape {
    private LegacyRectangle legacyRectangle;

    public LegacyRectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public void draw(int x, int y, int width, int height) {
        // Adapt the method call to the existing class
        int x1 = x;
        int y1 = y;
        int x2 = x + width;
        int y2 = y + height;
        legacyRectangle.drawRectangle(x1, y1, x2, y2);
    }
}
