package com.anthonyang.array;

import java.util.Scanner;

public class ArrayLeftRotationOptimized {

	public static class Solution {

		public static void main(String[] args) {
			System.out.println(7 % 5);

			Scanner scan = new Scanner(System.in);

			int noOfElements = scan.nextInt();
			int leftNotation = scan.nextInt();

			// Declare & initialize array
			int[] array = new int[noOfElements];

			// Setting array values + shifting based on LeftNotation
			// Modulus of "noOfElements" is triggered only if value >=
			// noOfElements value
			// It is added to also set the pointer back to position 0 * <-

			/*
			 * eg: noOfElements = 5; leftNotation = 2;
			 * 
			 * (0+5-2)=3 (1+5-2)=4 (2+5-2)=5 % 5 = 0 * <- (3+5-2)=6 % 5 = 1
			 * (4+5-2)=7 % 5 = 2
			 * 
			 */
			for (int i = 0; i < noOfElements; i++) {
				array[(i + noOfElements - leftNotation) % noOfElements] = scan.nextInt();
			}
			for (int i = 0; i < noOfElements; i++) {
				System.out.print(array[i] + " ");
			}
			scan.close();
		}
	}

}
