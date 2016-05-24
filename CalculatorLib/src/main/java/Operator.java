public enum Operator {

    ADD(1), SUBTRACT(1), MULTIPLY(2), DIVIDE(2);

    private final int precedence;

    Operator(int priority) {
        this.precedence = priority;
    }

    public int getPrecedence() {
        return precedence;
    }
}
