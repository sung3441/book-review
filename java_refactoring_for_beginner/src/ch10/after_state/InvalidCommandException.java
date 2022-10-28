package ch10.after_state;

public class InvalidCommandException extends Exception {

    public InvalidCommandException(String name) {
        super(name);
    }

    public InvalidCommandException() {

    }
}
