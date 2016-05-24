import CalculatorLibExceptions.IllegalExpressionInputException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionValidator implements Validator {
    private static final Pattern OPERATIONS = Pattern.compile("^[+-/*0-9() =]+");

    @Override
    public boolean validate(String input) {
        Matcher expressionMatcher = OPERATIONS.matcher(input);
        if(expressionMatcher.matches()){
            return false;
        } else throw new IllegalExpressionInputException("Wrong operation!");

    }
}
