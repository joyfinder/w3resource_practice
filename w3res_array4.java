/* Write a Java program to find the maximum and minimum value of an array. */

import java.util.Arrays;

class w3res_array4 {

	static int max_val;
	static int min_val;

	public static void max_min(int arr[]){
		max_val = arr[0];
		min_val = arr[0];
		int len = arr.length;
		for(int i = 1; i < len - 1; i = i + 2)
		{
			if(i + 1 > len)
			{
				if(arr[i] > max_val)
					max_val = arr[i];
				if(arr[i] < min_val)
					min_val = arr[i];
			}
			if(arr[i] > arr[i + 1])
			{
				if(arr[i] > max_val)
					max_val = arr[i];
				if(arr[i] < min_val)
					min_val = arr[i+1];
			}
			if(arr[i] < arr[i + 1])
			{
				if(arr[i] > max_val)
					max_val = arr[i+1];
				if(arr[i] < min_val)
					min_val = arr[i];
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr = {9,2,3,5,6,8,1,4,7};
		max_min(arr);
		System.out.println(" Original Array: " + Arrays.toString(arr));
		System.out.println(" Maximum value for the above array = " + max_val);
		System.out.println(" Minimum value for the above array = " + min_val);


	}
}