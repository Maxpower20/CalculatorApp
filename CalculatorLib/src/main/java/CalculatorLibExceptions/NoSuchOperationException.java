package CalculatorLibExceptions;


public class NoSuchOperationException extends RuntimeException {
    public NoSuchOperationException(String message){
        super(message);
    }

}
