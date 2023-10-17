package KI306.Shchyrba.Lab5;

public class CalcException extends ArithmeticException {
    /**
     * Default constructor for CalcException.
     */
    public CalcException() {
    }

    /**
     * Constructor for CalcException with a custom error message.
     *
     * @param cause The error message describing the cause of the exception.
     */
    public CalcException(String cause) {
        super(cause);
    }
}