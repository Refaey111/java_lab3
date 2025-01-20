package exceptions;

public class PersonNotAvailableException extends RuntimeException {
    public PersonNotAvailableException(String message) {
        super(message);
    }
}
