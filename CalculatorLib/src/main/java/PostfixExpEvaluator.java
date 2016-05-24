import java.util.Deque;
import java.util.LinkedList;

public class PostfixExpEvaluator implements Evaluator{

    private Deque<String> stack;
    private DigitsValidator digitsValidator;
    private OperationsValidator operationsValidator;

    public PostfixExpEvaluator() {
        this.stack = new LinkedList<>();
        this.digitsValidator = new DigitsValidator();
        this.operationsValidator = new OperationsValidator();
    }

    @Override
    public String evaluate(String postFixExp) {

        String[] separatedExpression = postFixExp.split(" ");

        for (String element: separatedExpression) {
            if(digitsValidator.validate(element)){

                stack.push(element);

            } else if(operationsValidator.validate(element)){
                stack.push(doTheOperation(element));
            }
        }


        return stack.pop();
    }


    private String doTheOperation(String element){
        int firstArg = Integer.parseInt(stack.pop());
        int secondArg = Integer.parseInt(stack.pop());
        int result = 0;

        if("+".equals(element)){
            result = firstArg + secondArg;

        } else if("-".equals(element)){
            result = secondArg - firstArg;

        } else if("*".equals(element)){
            result = firstArg * secondArg;

        } else if("/".equals(element)){
            result = secondArg / firstArg;
        }
        return String.valueOf(result);
    }

}
