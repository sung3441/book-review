package ch01.after_typecode;

public class Character {

    public static final CharacterMove MOVE_WALK = new CharacterMove("WALK");
    public static final CharacterMove MOVE_STOP = new CharacterMove("STOP");
    public static final CharacterMove MOVE_JUMP = new CharacterMove("JUMP");

    private final String name;

    public Character(String name) {
        this.name = name;
    }

    void order(CharacterMove move) {
        if (move == MOVE_WALK) {
            System.out.println(name + " walks");
        } else if (move == MOVE_STOP) {
            System.out.println(name + "stops");
        } else if (move == MOVE_JUMP) {
            System.out.println(name + " jumps");
        } else {
            System.out.println("Error: " + move);
        }
    }
}
