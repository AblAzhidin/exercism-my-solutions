class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        } else if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        int result = 0;
        try {
            switch (operation) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    result = operand1 / operand2;
                    break;
                default:
                    throw new IllegalOperationException("Operation '%s' does not exist".formatted(operation));
            }
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }

        return "%s %s %s = %s".formatted(operand1, operation, operand2, result);
    }
}
