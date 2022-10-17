package ch04.nested;

public class Label {

    private final String label;

    public Label(String label) {
        this.label = label;
    }

    public void display() {
        System.out.println("display: " + label);
    }

    public String toString() {
        return "\"" + label + "\"";
    }

    public boolean isNull() {
        return false;
    }

    public static Label newNull() {
        return NullLabel.getInstance();
    }

    private static class NullLabel extends Label {

        private static final NullLabel singleton = new NullLabel();

        private static NullLabel getInstance() {
            return singleton;
        }

        public NullLabel() {
            super("(none)");
        }

        @Override
        public void display() {}

        @Override
        public boolean isNull() {
            return true;
        }
    }
}
