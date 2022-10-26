package ch08.after;

public abstract class Shape {

    public static final int TYPE_CODE_LINE = 0;
    public static final int TYPE_CODE_RECTANGLE = 1;
    public static final int TYPE_CODE_OVAL = 2;

    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;

    public static Shape createShape(int typeCode, int startX, int startY, int endX, int endY) {
        switch (typeCode) {
            case TYPE_CODE_LINE:
                return new ShapeLine(startX, startY, endX, endY);
            case TYPE_CODE_RECTANGLE:
                return new ShapeRectangle(startX, startY, endX, endY);
            case TYPE_CODE_OVAL:
                return new ShapeOval(startX, startY, endX, endY);
            default:
                return null;
        }
    }

    protected Shape(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public abstract int getTypeCode();

    public abstract String getName();

    @Override
    public String toString() {
        return "[ "
                + getName() + ", "
                + "(" + startX + ", " + startY + ")-"
                + "(" + endX + ", " + endY + ") ]";
    }

    public abstract void draw();
}
