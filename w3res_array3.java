/*Write a Java program to insert an element (specific position) into an array.*/

import java.util.Arrays;

class w3res_array3 {
	
	public static void main(String[] args)
	{
		int[] arr = {9,2,3,5,6,8,1,4,7};

		// Insert an element in 4th index position of array (index -> 3, valu -> 10)

		int idx_position = 3;
		int val = 10;

		System.out.println("Initial arrays : " + Arrays.toString(arr));

		for(int i = arr.length - 1; i > idx_position; i--)
		{
			arr[i] = arr[i - 1];
		}
		arr[idx_position] = val;
		System.out.println("New Array after inserting an element: " + Arrays.toString(arr));
	}	
}