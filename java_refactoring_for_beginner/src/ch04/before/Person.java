package ch04.before;

public class Person {

    private final Label name;
    private final Label mail;

    public Person(Label name, Label mail) {
        this.name = name;
        this.mail = mail;
    }

    public Person(Label name) {
        this(name, null);
    }

    public void display() {
        if (name != null) {
            name.display();
        }
        if (mail != null) {
            mail.display();
        }
    }

    public String toString() {
        String result = "[ Person:";

        result += " name =";
        if (name == null) {
            result += "\"(none)\"";
        } else {
            result += name;
        }

        result += " mail=";
        if (mail == null) {
            result += "\"(none)\"";
        } else {
            result += mail;
        }
        result += " ]";

        return result;
    }
}
