/*Take three numbers from the user and print the greatest number.*/


import java.util.Scanner;

class w3res_condi_statement2 {
	public static void main(String[] args)
	{
		int num, num2, num3;

		Scanner val = new Scanner(System.in);
		System.out.println("Please enter 1st number: ");
		num = val.nextInt();

		Scanner val2 = new Scanner(System.in);
		System.out.println("Please enter 1st number: ");
		num2 = val2.nextInt();

		Scanner val3 = new Scanner(System.in);
		System.out.println("Please enter 1st number: ");
		num3 = val3.nextInt();

		System.out.println("The greatest: " + Math.max(num,Math.max(num2,num3)));

	}
}