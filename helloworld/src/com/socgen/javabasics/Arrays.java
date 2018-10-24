package com.socgen.javabasics;

public class Arrays {

	public static void main(String[] args) {
		int[] ints = new int[10];
		ints[3] = 5;
		System.out.println(ints[3]);

		//

//		boolean[] booleans = new boolean[10];
//
//		System.out.println(booleans[3]);
//		booleans[3] = true;
//		System.out.println(booleans[3]);
//
//	for (int i = 0; i < booleans.length; i++) {
//		 System.out.println(i + " = " + booleans[i]);

		String explosion = "explosion";
		char[] exploded = explosion.toCharArray();
		for (int i1 = 0; i1 < exploded.length; i1++) {
			System.out.println(exploded[i1]);
		}
	}

}
