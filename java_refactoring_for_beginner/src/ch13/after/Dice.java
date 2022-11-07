package ch13.after;

import java.util.Random;

public class Dice {

    private final Random random;

    public Dice() {
        random = new Random(123123L);
        // super(123123L); 생성자 연쇄
    }

    public Dice(long seed) {
        random = new Random(seed);
    }

    public int nextInt() {
        return random.nextInt(6) + 1;
    }

    public void setSeed(long seed) {
        random.setSeed(seed);
    }
}
