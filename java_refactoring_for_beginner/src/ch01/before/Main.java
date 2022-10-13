package ch01.before;

public class Main {
    public static void main(String[] args) {
        Character character = new Character("피카츄");
        character.order(0); // walk
        character.order(1); // stop
        character.order(2); // jump
    }
}
