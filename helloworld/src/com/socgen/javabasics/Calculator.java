package com.socgen.javabasics;

/**
 * This class provides. Detailed description
 * 
 * @author Administrateur
 *
 */
public class Calculator {
	/**
	 * This variable provides .
	 */
	private double a;
	private double b;

	/**
	 * This constructor provides
	 * 
	 * @param a operand a
	 * @param b operand b
	 */
	public Calculator(double a, double b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * This method provides
	 * 
	 * @return a + b
	 */
	public double add() {
		return a + b;
	}

	public double divide() {
		return a / b;
	}

	public double substract() {
		return a - b;
	}

	public double mutiply() {
		return a * b;
	}

}
