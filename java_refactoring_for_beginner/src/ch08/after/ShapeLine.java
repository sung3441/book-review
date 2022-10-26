package ch08.after;

public class ShapeLine extends Shape {

    protected ShapeLine(int startX, int startY, int endX, int endY) {
        super(startX, startY, endX, endY);
    }

    @Override
    public int getTypeCode() {
        return Shape.TYPE_CODE_LINE;
    }

    @Override
    public String getName() {
        return "LINE";
    }

    @Override
    public void draw() {
        drawLine();
    }

    private void drawLine() {
        System.out.println("drawLine: " + this.toString());
    }
}
