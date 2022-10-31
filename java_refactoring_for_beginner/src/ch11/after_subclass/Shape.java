package ch11.after_subclass;

public abstract class Shape {

    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;

    public static Shape createLine(int startX, int startY, int endX, int endY) {
        return new ShapeLine(startX, startY, endX, endY);
    }

    public static Shape createRectangle(int startX, int startY, int endX, int endY) {
        return new ShapeRectangle(startX, startY, endX, endY);
    }

    public static Shape createOval(int startX, int startY, int endX, int endY) {
        return new ShapeOval(startX, startY, endX, endY);
    }

    protected Shape(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public String toString() {
        return "[ "
                + getName() + ", "
                + "(" + startX + ", " + startY + ")-"
                + "(" + endX + ", " + endY + ") ]";
    }

    public abstract String getName();

    public abstract void draw();
}
