

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitsValidator implements Validator {
    private static final Pattern ONLY_DIGITS = Pattern.compile("^[0-9]+");


    @Override
    public boolean validate(String input) {
        Matcher digitsMatcher = ONLY_DIGITS.matcher(input);

        return digitsMatcher.matches();

    }

}
