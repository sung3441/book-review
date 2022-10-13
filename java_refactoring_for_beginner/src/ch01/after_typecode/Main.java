package ch01.after_typecode;

public class Main {

    public static void main(String[] args) {
        Character character = new Character("피카츄");
        character.order(Character.MOVE_WALK); // walk
        character.order(Character.MOVE_STOP); // stop
        character.order(Character.MOVE_JUMP); // jump
    }
}
