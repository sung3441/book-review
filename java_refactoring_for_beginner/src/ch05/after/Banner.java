package ch05.after;

public class Banner {

    private final String content;

    public Banner(String content) {
        this.content = content;
    }

    public void print(int times) {
        printBoard();
        printContent(times);
        printBoard();
    }

    private void printContent(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("|" + content + "|");
        }
    }

    private void printBoard() {
        System.out.print("+");
        for (int i = 0; i < content.length(); i++) {
            System.out.print("-");
        }
        System.out.print("+");
    }
}
