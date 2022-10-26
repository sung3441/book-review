package ch08.before;

public class Shape {

    public static final int TYPE_CODE_LINE = 0;
    public static final int TYPE_CODE_RECTANGLE = 1;
    public static final int TYPE_CODE_OVAL = 2;

    private final int typeCode;
    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;

    protected Shape(int typeCode, int startX, int startY, int endX, int endY) {
        this.typeCode = typeCode;
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public String getName() {
        switch (typeCode) {
            case TYPE_CODE_LINE:
                return "LINE";
            case TYPE_CODE_RECTANGLE:
                return "RECTANGLE";
            case TYPE_CODE_OVAL:
                return "OVAL";
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return "[ "
                + getName() + ", "
                + "(" + startX + ", " + startY + ")-"
                + "(" + endX + ", " + endY + ") ]";
    }

    public void draw() {
        switch (typeCode) {
            case TYPE_CODE_LINE:
                drawLine();
                break;
            case TYPE_CODE_RECTANGLE:
                drawRectangle();
                break;
            case TYPE_CODE_OVAL:
                drawOval();
                break;
        }
    }

    private void drawLine() {
        System.out.println("drawLine: " + this.toString());
    }

    private void drawRectangle() {
        System.out.println("drawRectangle: " + this.toString());
    }

    private void drawOval() {
        System.out.println("drawOval: " + this.toString());
    }
}
