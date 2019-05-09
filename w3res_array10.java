import java.util.*;
import java.lang.*;

class w3res_array10 {
	public static void main(String[] args)
	{
		int[] arr = {3,5,6,7,4,8,7,9};
		int smallest_val, sec_smallest_val;

		smallest_val = sec_smallest_val = Integer.MAX_VALUE;

		for(int i = 0; i < arr.length; i++)
		{
			// To compare both smallest & sec_smallest value if current is smaller than smallest.
			if(arr[i] < smallest_val)
			{
				sec_smallest_val = smallest_val;
				smallest_val = arr[i];
			}

			/* To compare sec_smallest value if arr[i] is between sec_smallest and smallest.*/
			else if (arr[i] < sec_smallest_val && arr[i] != smallest_val)
				sec_smallest_val = arr[i];
		}

		do {
			System.out.println("The smallest value in array: " + smallest_val);
			System.out.println("The second smallest value in array: " + sec_smallest_val);
		} while (sec_smallest_val == Integer.MAX_VALUE);
		

		}
}
