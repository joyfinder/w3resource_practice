/*Write a Java program to add two matrices of the same size */

import java.util.Scanner;

class w3res_array9 {
	public static void main(String[] args)
	{
		int x,y,loop,loop2;

		Scanner input_val = new Scanner(System.in);
		System.out.println("Enter number of rows of matrix: ");
		x = input_val.nextInt();
		System.out.println("Enter number of columns of matrix: ");
		y = input_val.nextInt();

		int arr[][] = new int[x][y];
		int arr2[][] = new int[x][y];
		int add[][] = new int[x][y];

		System.out.println("Enter elements of 1st matrix: ");

		for(loop = 0; loop < x; loop++)
		{
			for(loop2 = 0; loop2 < y; loop2++)
			{
				arr[loop][loop2] = input_val.nextInt();
			}
		}


		System.out.println("Enter elements of 2nd matrix: ");

		for(loop = 0; loop < x; loop++)
		{
			for(loop2 = 0; loop2 < y; loop2++)
			{
				arr2[loop][loop2] = input_val.nextInt();
			}
		}

		for(loop = 0; loop < x; loop++)
		{
			for(loop2 = 0; loop2 < y; loop2++)
			{
				add[loop][loop2] = arr[loop][loop2] + arr2[loop][loop2];
			}
		}

		System.out.println("Sum of the matrices: ");

		for(loop = 0; loop < x; loop++)
		{
			for(loop2 = 0; loop2 < y; loop2++)
			{
				System.out.print(add[loop][loop2]+"\t");
			}
			System.out.println();
		}
	}
}