/* Write a Java program to calculate the average value of array elements*/

class w3res_array {
	public static void main(String[] args)
	{
		int[] arr = {2,4,5,6,23,66,7};
		int add = 0;

		for(int num_arr : arr)
			add += num_arr;

		System.out.println("The average sum of an array is: " + (add / arr.length));
	}
}