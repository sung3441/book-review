package ch04.after;

public class Main {

    public static void main(String[] args) {
        Person[] people = {
                new Person(new Label("Alice"), new Label("alice@example.com")),
                new Person(new Label("Jordan"), new Label("jordan@example.com")),
                new Person(new Label("Bob"))
        };

        for (Person p : people) {
            System.out.println(p.toString());
            p.display();
            System.out.println();
        }
    }
}
