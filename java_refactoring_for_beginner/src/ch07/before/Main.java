package ch07.before;

public class Main {

    public static void main(String[] args) {
        Item book = new Item(
                Item.TYPE_CODE_BOOK,
                "세계 역사",
                4_000
        );

        Item dvd = new Item(
                Item.TYPE_CODE_DVD,
                "미녀와 야수",
                3_000
        );

        Item soft = new Item(
                Item.TYPE_CODE_SOFTWARE,
                "eclipse",
                10_000
        );

        System.out.println("book = " + book.toString());
        System.out.println("book = " + dvd.toString());
        System.out.println("book = " + soft.toString());
    }
}
