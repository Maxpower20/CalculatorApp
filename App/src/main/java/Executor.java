import java.io.IOException;

public class Executor {

    private Calculator calculator;


    public void execute() throws IOException {

        IOUtil.printToConsole("Please, print the expression to calculate as shown in example: ( 8 + 2 * 5 ) / ( 1 + 3 * 2 - 4 ) ");
        IOUtil.blankRow();
        String expression = IOUtil.readTheExpression();
        String result = calculator.calculate(expression);
        IOUtil.printToConsole(expression);
        IOUtil.printEquals();
        IOUtil.printToConsole(result);

    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
}
