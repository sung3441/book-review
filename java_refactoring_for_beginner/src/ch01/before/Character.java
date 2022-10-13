package ch01.before;

public class Character {
    private final String name;

    public Character(String name) {
        this.name = name;
    }

    void order(int move) {
        if (move == 0) {
            System.out.println(name + " walks");
        } else if (move == 1) {
            System.out.println(name + " stops");
        } else if (move == 2) {
            System.out.println(name + " jumps");
        } else {
            System.out.println("Error: " + move);
        }
    }
}
