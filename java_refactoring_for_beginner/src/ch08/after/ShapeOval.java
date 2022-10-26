package ch08.after;

public class ShapeOval extends Shape {

    protected ShapeOval(int startX, int startY, int endX, int endY) {
        super(startX, startY, endX, endY);
    }

    @Override
    public int getTypeCode() {
        return Shape.TYPE_CODE_OVAL;
    }

    @Override
    public String getName() {
        return "OVAL";
    }

    @Override
    public void draw() {
        drawOval();
    }

    private void drawOval() {
        System.out.println("drawOval: " + this.toString());
    }
}
