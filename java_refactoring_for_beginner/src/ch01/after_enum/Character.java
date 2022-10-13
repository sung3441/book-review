package ch01.after_enum;

public class Character {

    private final String name;

    public enum Move {
        WALK,
        STOP,
        JUMP,
    }

    public Character(String name) {
        this.name = name;
    }

    public void order(Character.Move move) {
        if (move == Move.WALK) {
            System.out.println(name + " works");
        } else if (move == Move.STOP) {
            System.out.println(name + " stops");
        } else if (move == Move.JUMP) {
            System.out.println(name + " jumps");
        } else {
            System.out.println("Error: " + move);
        }
    }
}
