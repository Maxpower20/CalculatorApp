
public class Calculator {

    String calculate(String expression) {

        if(expression.isEmpty()){
            throw (new IllegalArgumentException("Input should not be empty!"));
        }

        PolishNotationConverter converter = new PolishNotationConverter();
        String converted = converter.convert(expression);

        PostfixExpEvaluator evaluator = new PostfixExpEvaluator();
        String result = evaluator.evaluate(converted);

        return result;
    }

}
