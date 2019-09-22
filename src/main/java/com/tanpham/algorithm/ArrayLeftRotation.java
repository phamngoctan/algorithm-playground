package com.tanpham.algorithm;

import java.util.Scanner;

public class ArrayLeftRotation {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int numberOfIntegers = in.nextInt();
        int numberOfLeftRotations = in.nextInt();
        int numberArray[] = new int[numberOfIntegers];
        for (int i = 0; i < numberOfIntegers; i++) {
            numberArray[i] = in.nextInt();
        }
        int[] result = rotateArray(numberArray, numberOfLeftRotations);
        System.out.println(getOutputStrResult(result));
        in.close();
	}
	
	private static String getOutputStrResult(int[] arrayToBePrinted) {
		String resultStr = "";
		for (int i = 0; i < arrayToBePrinted.length; i++) {
			resultStr += arrayToBePrinted[i] + " ";
		}
		return resultStr.trim();
	}
	
	public static int[] rotateArray(int[] numberArray, int k) {
		if (k > numberArray.length) {
			k = k % numberArray.length;
		}
		
		int[] result = new int[numberArray.length];
		System.arraycopy(numberArray, 0, result, numberArray.length - k, k);
		System.arraycopy(numberArray, k, result, 0, numberArray.length - k);
		return result;
	}
	
	public static int[] rotateArrayUsingCalculatePositionAlgorithm(int[] originalArrayNumber, int shiftAmount) {
		int arrayLength = originalArrayNumber.length;
		if (shiftAmount > arrayLength) {
			shiftAmount = shiftAmount % arrayLength;
		}
		int[] result = new int[arrayLength];
		for (int i = 0; i < originalArrayNumber.length; i++) {
			int newLocation = (i + (arrayLength - shiftAmount)) % arrayLength;
			result[newLocation] = originalArrayNumber[i];
		}
		return result;
	}
	
}
