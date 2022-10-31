package ch11.after_subclass;

public class ShapeLine extends Shape {

    public ShapeLine(int startX, int startY, int endX, int endY) {
        super(startX, startY, endX, endY);
    }

    @Override
    public String getName() {
        return "LINE";
    }

    @Override
    public void draw() {
        System.out.println("drawLine: " + this.toString());
    }
}
