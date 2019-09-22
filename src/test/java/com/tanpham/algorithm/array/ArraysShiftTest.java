package com.tanpham.algorithm.array;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import javax.xml.bind.ValidationException;

import org.junit.Test;

public class ArraysShiftTest {

	@Test
	public void shiftRight_indexOutBoundIfItBreaksTheSize() throws ValidationException {
		int[] inputArray = new int[10];
		inputArray[0] = 0;
		inputArray[1] = 1;
		int toPosition = 1;
		Arrays.shiftRight(inputArray, toPosition);
		assertThat(inputArray[1], equalTo(0));
		assertThat(inputArray[2], equalTo(1));
	}
	
	@Test
	public void push_ItemAtPosition_autoShiftToTheRight() throws ValidationException {
		int[] inputArray = new int[10];
		inputArray[0] = 0;
		inputArray[1] = 1;
		int atPosition = 0;
		int value = 2;
		
		Arrays.push(inputArray, value, atPosition);
		
		assertThat(inputArray[0], equalTo(2));
		assertThat(inputArray[1], equalTo(0));
		assertThat(inputArray[2], equalTo(1));
	}
	
}
