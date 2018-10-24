package com.socgen.javabasics;

public class Primitives {
	public static void main(String[] args) {
		Calculator calc3 = new Calculator(5, 5);

		double result = calc3.mutiply();
		System.out.println(result);

		double result1 = calc3.add();
		System.out.println(result1);

		double result2 = calc3.divide();
		System.out.println(result2);

		double result3 = calc3.substract();
		System.out.println(result3);

		// Types primitives

//		double doubleType = 0;
//
//		int intType = (int) 0.0;
//
//		short shortType;
//		byte byteType;
//		float floatType;
//		char charType;
//		long longType;
//		boolean booleanType;
	}

}
