class CalculatorConundrum {

	private static final String OPERATION_PLUS = "+";
	private static final String OPERATION_MULTIPLY = "*";
	private static final String OPERATION_DIVISION = "/";

	public String calculate(int operand1, int operand2, String operation) {
		if (operation == null) {
			throw new IllegalArgumentException("Operation cannot be null");
		}
		if (operation.isEmpty()) {
			throw new IllegalArgumentException("Operation cannot be empty");
		}
		String result =  switch (operation) {
			case OPERATION_PLUS -> String.valueOf(operand1 + operand2);
			case OPERATION_MULTIPLY -> String.valueOf(operand1 * operand2);
			case OPERATION_DIVISION -> division(operand1, operand2);
			default -> throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
		};
		return String.format("%d %s %d = %s", operand1, operation, operand2, result);
	}

	private static String division(int operand1, int operand2) {
		if (operand2 == 0) {
			throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException("/ by zero"));
		}
		return String.valueOf(operand1 / operand2);
	}
}
