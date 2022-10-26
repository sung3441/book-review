package ch08.after;

public class Main {

    public static void main(String[] args) {
        Shape line = Shape.createShape(Shape.TYPE_CODE_LINE, 0, 0, 100, 200);
        Shape rectangle = Shape.createShape(Shape.TYPE_CODE_RECTANGLE, 10, 20, 30, 40);
        Shape oval = Shape.createShape(Shape.TYPE_CODE_OVAL, 100, 200, 300, 400);

        Shape[] shape = {
                line, rectangle, oval
        };

        for (Shape s : shape) {
            s.draw();
        }
    }
}
