/*Write a Java program to remove a specific element from an array.*/

import java.util.Arrays;

class w3res_array2 {
	public static void main(String[] args)
	{
		int[] arr = {2,3,5,8,9,1,4,6,7};

		// to call out the initial array
		System.out.println("Initial Array : " + Arrays.toString(arr));
		
		// remove the 5th element ()
		int erase_index = 4;

		for(int i = erase_index; i < arr.length - 1; i++)
				arr[i] = arr[i + 1];

		// unable to change size of array, so last & second last will be overlapped.
		System.out.println("After erasing 5th element: " + Arrays.toString(arr));
	}
}