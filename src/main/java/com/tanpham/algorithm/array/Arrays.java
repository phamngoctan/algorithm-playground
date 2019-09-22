package com.tanpham.algorithm.array;

import javax.xml.bind.ValidationException;

public class Arrays {

	public static void shiftRight(int[] inputArray, int toPosition) throws ValidationException {
		shiftRight(inputArray, 0, toPosition);
	}
	
	private static void shiftRight(int[] inputArray, int fromPosition, int toPosition) throws ValidationException {
		if (toPosition >= inputArray.length) {
			throw new ValidationException("The position to shift to cannot bigger than the size of the array");
		}
		int i = toPosition;
		while (i > fromPosition) {
			inputArray[i] = inputArray[i - 1];
			i--;
		}
	}
	
	private static void shiftRightFrom(int[] inputArray, int fromPosition) throws ValidationException {
		shiftRight(inputArray, fromPosition, inputArray.length - 1);
	}

	public static void push(int[] inputArray, int value, int atPosition) throws ValidationException {
		shiftRightFrom(inputArray, atPosition);
		inputArray[atPosition] = value;
	}
	
}
