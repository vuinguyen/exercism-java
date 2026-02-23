class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) throws IllegalArgumentException {
        int result = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(operand1).append(" ");
        stringBuilder.append(operation).append(" ");
        stringBuilder.append(operand2).append(" = ");

        try {
            if (operation == null) {
                throw new IllegalArgumentException("Operation cannot be null");
            }
            if (operation.isEmpty()) {
                throw new IllegalArgumentException("Operation cannot be empty");
            }

            switch (operation) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed");
                    }
                    result = operand1 / operand2;
                    break;
                default:
                    throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
            
        } catch (ArithmeticException e) {
            throw new IllegalOperationException(e.getMessage(), e);
        }
        finally {
            // Any cleanup code can go here if needed in the future
        }
            
        stringBuilder.append(result);
        return stringBuilder.toString();
        // throw new UnsupportedOperationException("Please implement the CalculatorConundrum.calculate() method");
    }
}
