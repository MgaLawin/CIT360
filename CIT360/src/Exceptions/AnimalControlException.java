package Exceptions;

/**
 *
 * @author Jeremy
 */
public class AnimalControlException extends Exception {

    public AnimalControlException() {
    }

    public AnimalControlException(String message) {
        super(message);
    }

    public AnimalControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public AnimalControlException(Throwable cause) {
        super(cause);
    }

    public AnimalControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
