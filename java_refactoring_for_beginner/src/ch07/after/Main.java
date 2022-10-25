package ch07.after;

public class Main {

    public static void main(String[] args) {
        Item book = new Item(
                ItemType.BOOK,
                "세계 역사",
                4_000
        );

        Item dvd = new Item(
                ItemType.DVD,
                "미녀와 야수",
                3_000
        );

        Item soft = new Item(
                ItemType.SOFTWARE,
                "eclipse",
                10_000
        );

        System.out.println("book = " + book.toString());
        System.out.println("book = " + dvd.toString());
        System.out.println("book = " + soft.toString());
    }
}
