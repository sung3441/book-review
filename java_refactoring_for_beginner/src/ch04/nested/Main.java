package ch04.nested;

import ch04.before.Label;
import ch04.before.Person;

public class Main {

    public static void main(String[] args) {
        ch04.before.Person[] people = {
                new ch04.before.Person(new ch04.before.Label("Alice"), new ch04.before.Label("alice@example.com")),
                new ch04.before.Person(new ch04.before.Label("Jordan"), new ch04.before.Label("jordan@example.com")),
                new ch04.before.Person(new Label("Bob"))
        };

        for (Person p : people) {
            System.out.println(p.toString());
            p.display();
            System.out.println();
        }
    }
}
