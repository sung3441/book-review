package ch04.before;

public class Label {

    private final String label;

    public Label(String label) {
        this.label = label;
    }

    public void display() {
        System.out.println("display = " + label);
    }

    public String toString() {
        return "\"" + label + "\"";
    }
}
