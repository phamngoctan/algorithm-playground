package com.tanpham.algorithm.array;

import javax.xml.bind.ValidationException;

public class Arrays {

	public static void shiftRight(int[] inputArray, int toPosition) {
		int i = toPosition;
		while (i >= 0) {
			inputArray[i + 1] = inputArray[i];
			i--;
		}
	}

	public static void push(int[] inputArray, int value, int atPosition) throws ValidationException {
		throw new ValidationException("Not support yet!");
	}
	
}
