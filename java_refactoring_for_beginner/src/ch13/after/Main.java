package ch13.after;

public class Main {

    public static void main(String[] args) {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice(123L);
        Dice dice3 = new Dice();
        Dice[] dices = {
                dice1,
                dice2,
                dice3
        };

        dice3.setSeed(123L);

        for (Dice dice : dices) {
            for (int i = 0; i < 10; i++) {
                System.out.printf("%d, ", dice.nextInt());
            }
            System.out.println();
        }
    }
}
