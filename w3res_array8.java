/*Write a Java program to find the common elements between two arrays of integers. */

import java.util.Arrays;

class w3res_array8{
	public static void main(String[] args)
	{
		int[] arr = {1,2,4,5,3,6,7,9};
		int[] arr2 = {1,2,4,6,7,9,5,8};

		System.out.println("Array : " + Arrays.toString(arr));
		System.out.println("Array2 : " + Arrays.toString(arr2));

		for(int x = 0; x < arr.length; x++)
		{
			for(int y = 0; y < arr.length; y++)
			{
				if(arr[x] == (arr2[y]))
				{
					System.out.println("Common elements are: " + arr[x]);
				}
			}
		}
	}
}