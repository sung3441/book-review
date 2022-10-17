package ch04.nested;

public class Person {

    private final Label name;
    private final Label mail;

    public Person(Label name, Label mail) {
        this.name = name;
        this.mail = mail;
    }

    public Person(Label name) {
        this(name, Label.newNull());
    }

    public void display() {
        name.display();
        mail.display();
    }

    public String toString() {
        return "[ Person: name=" + name + " mail= " + mail + " ]";
    }
}
