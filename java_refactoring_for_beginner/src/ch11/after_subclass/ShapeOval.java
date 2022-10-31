package ch11.after_subclass;

public class ShapeOval extends Shape {

    public ShapeOval(int startX, int startY, int endX, int endY) {
        super(startX, startY, endX, endY);
    }

    @Override
    public String getName() {
        return "OVAL";
    }

    @Override
    public void draw() {
        System.out.println("drawOval: " + this.toString());
    }
}
