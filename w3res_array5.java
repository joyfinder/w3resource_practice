/* Write a Java program to reverse an array of integer values. */

import java.util.Arrays;

class w3res_array5 {

	public static void main(String[] args)
	{
		int[] arr = {9,2,3,5,6,8,1,4,7};

		System.out.println("Initial arrays: " + Arrays.toString(arr));

		for(int i = 0; i < arr.length / 2; i++)
		{
			int rev = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = rev;
		}
		System.out.println("After reversing arrays: " + Arrays.toString(arr));
	}
}