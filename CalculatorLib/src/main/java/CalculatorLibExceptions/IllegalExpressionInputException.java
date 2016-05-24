package CalculatorLibExceptions;


public class IllegalExpressionInputException extends RuntimeException {
    public IllegalExpressionInputException(String message){
        super(message);
    }
}
