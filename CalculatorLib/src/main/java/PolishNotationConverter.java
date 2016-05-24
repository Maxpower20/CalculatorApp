import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class PolishNotationConverter implements Converter<String> {
    private DigitsValidator digitsValidator;
    private Deque<String> stack;
    private StringBuilder convertedExpression;
    private Map<String, Operator> operators =  new HashMap<>();

        {
            operators.put("+", Operator.ADD);
            operators.put("-", Operator.SUBTRACT);
            operators.put("*", Operator.MULTIPLY);
            operators.put("/", Operator.DIVIDE);
        }
    public PolishNotationConverter() {
        this.stack = new LinkedList<>();
        this.convertedExpression = new StringBuilder();
        this.digitsValidator = new DigitsValidator();
    }

    @Override
    public String convert(String expression) {

        String[] separatedExpression = expression.split(" ");

        for (String element: separatedExpression) {
            if(digitsValidator.validate(element))
            {
                convertedExpression.append(element).append(" ");

            } else if (operators.containsKey(element)){

                while(!stack.isEmpty() && isHigherPriority(element, stack.peek())){
                    convertedExpression.append(stack.pop()).append(" ");
                }

                stack.push(element);
            } else if (isOpeningBrace(element)){

                stack.push(element);

            } else if (isClosingBrace(element)){

                while(!isOpeningBrace(stack.peek())){
                    convertedExpression.append(stack.pop()).append(" ");
                }

                stack.pop();

        }
            } while (!stack.isEmpty()){
                convertedExpression.append(stack.pop()).append(" ");

            }

        return convertedExpression.toString();
    }


    private boolean isOpeningBrace(String input){
        return "(".equals(input);
    }

    private boolean isClosingBrace(String input) {
        return ")".equals(input);
    }

    private boolean isHigherPriority(String op, String sub){

        return (operators.containsKey(sub) && operators.get(sub).getPrecedence() >= operators.get(op).getPrecedence());

    }

}



