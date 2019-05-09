/* Write a Java program to find the duplicate values of an array of integer values. */

import java.util.Arrays;

class w3res_array6 {
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,4,3,2};

		for(int x = 0; x < arr.length - 1; x++)
		{
			for(int y = x+1; y < arr.length; y++)
			{
				if((arr[x] == arr[y]) && (x != y))
				{
					System.out.println("Repeated values in arrays are: " + arr[y]);
				}
			}
		}
	}

}