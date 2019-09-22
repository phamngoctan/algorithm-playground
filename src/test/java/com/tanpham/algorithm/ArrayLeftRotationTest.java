package com.tanpham.algorithm;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ArrayLeftRotationTest {

	/*
	 * ori:                     1 2 3 4 5
	 * number items to rotate:  1
	 * expected result:         2 3 4 5 1
	 */
	@Test
	public void rotateArray_rotateLeftOneItem() {
		int[] nums = prepareInputArray(5);
		int[] rotatedArray = ArrayLeftRotation.rotateArray(nums, 1);
		assertThat(rotatedArray[0], equalTo(2));
		assertThat(rotatedArray[1], equalTo(3));
		assertThat(rotatedArray[2], equalTo(4));
		assertThat(rotatedArray[3], equalTo(5));
		assertThat(rotatedArray[4], equalTo(1));
	}
	
	/*
	 * ori:                     1 2 3 4 5
	 * number items to rotate:  2
	 * expected result:         3 4 5 1 2
	 */
	@Test
	public void rotateArray_rotateLeftTwoItems() {
		int[] nums = prepareInputArray(5);
		int[] rotatedArray = ArrayLeftRotation.rotateArray(nums, 2);
		assertThat(rotatedArray[0], equalTo(3));
		assertThat(rotatedArray[1], equalTo(4));
		assertThat(rotatedArray[2], equalTo(5));
		assertThat(rotatedArray[3], equalTo(1));
		assertThat(rotatedArray[4], equalTo(2));
	}

	/*
	 * ori:                     1 2 3 4 5
	 * number items to rotate:  1
	 * expected result:         2 3 4 5 1
	 */
	@Test
	public void rotateArrayUsingCalculatePositionAlgorithm_rotateLeftOneItem() {
		int[] nums = prepareInputArray(5);
		int[] rotatedArray = ArrayLeftRotation.rotateArray(nums, 1);
		assertThat(rotatedArray[0], equalTo(2));
		assertThat(rotatedArray[1], equalTo(3));
		assertThat(rotatedArray[2], equalTo(4));
		assertThat(rotatedArray[3], equalTo(5));
		assertThat(rotatedArray[4], equalTo(1));
	}
	
	/*
	 * ori:                     1 2 3 4 5
	 * number items to rotate:  2
	 * expected result:         3 4 5 1 2
	 */
	@Test
	public void rotateArrayUsingCalculatePositionAlgorithm_rotateLeftTwoItems() {
		int[] nums = prepareInputArray(5);
		int[] rotatedArray = ArrayLeftRotation.rotateArray(nums, 2);
		assertThat(rotatedArray[0], equalTo(3));
		assertThat(rotatedArray[1], equalTo(4));
		assertThat(rotatedArray[2], equalTo(5));
		assertThat(rotatedArray[3], equalTo(1));
		assertThat(rotatedArray[4], equalTo(2));
	}
	
	private int[] prepareInputArray(int numberOfItems) {
		int[] nums = new int[numberOfItems];
		for (int i = 1; i <= nums.length; i++) {
			nums[i - 1] = i;
		}
		return nums;
	}
	
}
