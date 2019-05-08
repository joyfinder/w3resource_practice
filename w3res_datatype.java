/* Write a Java program which accepts 2 integers from user
   and then prints the sum, the differentce, the product,
   the average, the distance (the difference btw integer),
   the maximum (the larger of the two integers), the
   minimum (smaller of the two integers). 
   Q9 from w3resource*/

import java.util.Scanner;

class w3res_datatype {
	public static void main(String[] args)
	{
		int x, y;

		Scanner val = new Scanner(System.in);
		System.out.println("Please enter 1st value: ");
		x = val.nextInt();

		Scanner val2 = new Scanner(System.in);
		System.out.println("Please enter 2nd value: ");
		y = val2.nextInt();

		System.out.println("Sum of two integers: " + (x + y));
		System.out.println("Difference of two integers: " + (x - y));
		System.out.println("Product of two integers: " + (x * y));
		System.out.println("Average of two integers: " + (x + y));
		System.out.println("Sum of two integers: " + ((x + y) / 2));
		System.out.println("Distance of two integers: " + Math.abs(x - y));
		System.out.println("Max integer: " + Math.max(x,y));
		System.out.println("Min integer: " + Math.min(x,y));
	}
}