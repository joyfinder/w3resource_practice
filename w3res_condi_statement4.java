/* Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places */

import java.util.Scanner;

class w3res_condi_statement4 {
	public static void main(String[] args)
	{
		double num, num2;

		Scanner val = new Scanner(System.in);
		System.out.println("Please enter 1st flaoing-point number: ");
		num = val.nextDouble();

		Scanner val2 = new Scanner(System.in);
		System.out.println("Please enter 1st flaoing-point number: ");
		num2 = val2.nextDouble();

		if(num == num2)
		{
			System.out.println("They are the same");
		}
		else
		{
			System.out.println("They are different");
		}
	}
}