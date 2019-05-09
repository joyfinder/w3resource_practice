/* Write a Java program to count the number of possible triangles from an given unsorted array of positive integers.  */

import java.util.*;
import java.lang.*;

class w3res_array11 {
	public static void main(String[] args)
	{
		int[] arr = {3,6,7,8,3,7,5,8,4,10};

		System.out.println("Initial arrays: " + Arrays.toString(arr));

		// Sort array elements in non-decraesing order
		Arrays.sort(arr);

		// Initailize counting triangles
		int count_trian = 0;

		for(int x = 0; x < arr.length - 2; x++)
		{
			int y = x + 2;

			for(int z = x + 1; z < arr.length; z++)
			{
				if(y < arr.length && arr[x] + arr[z] > arr[y]) 
				{
					++y;
					count_trian += y - z - 1;
				}
				else
				{
					break;
				}
			}
		}
			System.out.println("Total number of triangles: " + count_trian);

	}
}