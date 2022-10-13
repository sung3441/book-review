package ch01.after_field;

public class Character {

    public static final int MOVE_WALK = 0;
    public static final int MOVE_STOP = 1;
    public static final int MOVE_JUMP = 2;

    private final String name;

    public Character(String name) {
        this.name = name;
    }

    void order(int move) {
        if (move == MOVE_WALK) {
            System.out.println(name + " walks");
        } else if (move == MOVE_STOP) {
            System.out.println(name + " stops");
        } else if (move == MOVE_JUMP) {
            System.out.println(name + " jumps");
        } else {
            System.out.println("Error: " + move);
        }
    }
}
