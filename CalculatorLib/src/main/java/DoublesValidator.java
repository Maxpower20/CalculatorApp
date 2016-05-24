import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DoublesValidator implements Validator {
    public static final Pattern DOUBLES = Pattern.compile("-?[0-9]+.?[0-9]*");

    @Override
    public boolean validate(String input) {
        Matcher digitsMatcher = DOUBLES.matcher(input);

        return digitsMatcher.matches();

    }

}
