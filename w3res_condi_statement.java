/*Write a Java program to get a number from the user and print whether it is positive or negative. */

import java.util.Scanner;

class w3res_condi_statement {
	public static void main(String[] args)
	{
		int num;

		Scanner val = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		num = val.nextInt();

		if(num < 0)
		{
			System.out.println("Number is negative");
		}
		else
		{
			System.out.println("Number is positive");
		}
	}
}