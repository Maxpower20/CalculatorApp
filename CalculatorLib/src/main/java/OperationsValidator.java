import CalculatorLibExceptions.NoSuchOperationException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OperationsValidator implements Validator {

    private static final Pattern OPERATIONS = Pattern.compile("^[+-/*]+");


    @Override
    public boolean validate(String input) {
        Matcher operationMatcher = OPERATIONS.matcher(input);
        if(operationMatcher.matches()){
            return true;
        } else throw new NoSuchOperationException("Wrong specification of operation!");
    }
}
