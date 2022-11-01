package ch12.after_graph;

import java.awt.*;

public class Graph extends Canvas implements ValueListener {

    public static final int RECTANGLE = 0;
    public static final int CIRCLE = 1;
    protected int graphValue;

    // 팩토리 메서드
    public static Graph create(int type, int width, int height) {
        Graph graph = null;
        if (type == RECTANGLE) {
            graph = new RectangleGraph();
        } else if (type == CIRCLE) {
            graph = new CircleGraph();
        } else {
            throw new RuntimeException("Unknown Graph Type");
        }
        graph.setSize(new Dimension(width, height));
        return graph;
    }

    @Override
    public void valueChanged(ValueChangeEvent e) {
        graphValue = e.getSource().getValue();
        repaint();
    }

    // 중첩 클래스
    private static class RectangleGraph extends Graph {

        public void paint(Graphics g) {
            g.setColor(graphValue > 0 ? Color.BLUE : Color.RED);
            Rectangle bounds = getBounds();
            int x, y, w, h;
            if (graphValue > 0) {
                w = (int) (bounds.width / 2 * graphValue / 100.0);
                h = bounds.height / 2;
                x = bounds.width / 2;
                y = bounds.height / 4;
            } else {
                w = (int) (bounds.width / 2 * -graphValue / 100.0);
                h = bounds.height / 2;
                x = bounds.width / 2 - w;
                y = bounds.height / 4;
            }
            g.fillRect(x, y, w, h);
        }
    }

    // 중첩 클래스
    private static class CircleGraph extends Graph {

        public void paint(Graphics g) {
            g.setColor(graphValue > 0 ? Color.BLUE : Color.RED);
            Rectangle bounds = getBounds();
            int startAngle = 90;
            int endAngle = -(int) (graphValue * 10.0);
            g.fillArc(0, 0, bounds.width, bounds.height, startAngle, endAngle);
        }
    }
}
