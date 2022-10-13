package ch01.after_enum;

public class Main {

    public static void main(String[] args) {
        Character character = new Character("피카츄");
        character.order(Character.Move.WALK);
        character.order(Character.Move.STOP);
        character.order(Character.Move.JUMP);
    }
}
