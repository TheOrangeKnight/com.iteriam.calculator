package com.iteriam.calculator.enums;

import com.iteriam.calculator.interfaces.IBasicOperation;

public enum BasicOperationEnum {

	ADDITION('+', (op1, op2) -> op1 + op2), 
	SUBTRACTION('-', (op1, op2) -> op1 - op2);
	/** TODO To implement into the future
	MULTIPLICATON('*', (op1, op2) -> op1 * op2),
	DIVISION('/', (op1, op2) -> op1 / op2);
	*/

	BasicOperationEnum(Character operationSymbol, IBasicOperation basicOperationMethod) {
		this.operationSymbol = operationSymbol;
		this.basicOperationMethod = basicOperationMethod;
	}

	private final Character operationSymbol;

	private final IBasicOperation basicOperationMethod;

	public Character getOperationSymbol() {
		return operationSymbol;
	}

	public double getOperationResult(double op1, double op2) {
		return basicOperationMethod.basicOperationMethod(op1, op2);
	}

}
