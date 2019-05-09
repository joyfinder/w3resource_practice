/* Write a Java program to display Pascal's triangle. 

Test Data
Input number of rows: 5 
Expected Output :

Input number of rows: 5                                                          
      1                                                                          
     1 1                                                                         
    1 2 1                                                                        
   1 3 3 1                                                                       
  1 4 6 4 1 */

import java.util.Scanner;

class w3res_condi_statement6 {
	public static void main(String[] args)
	{
		int num;
		int x,y,z, a = 1;

		Scanner val = new Scanner(System.in);
		System.out.println("Please enter the number of rows: ");
		num = val.nextInt();

		// 1st iteration determines the number of rows
		for(x = 0; x <= num; x++)
		{
			// 2nd iteration determines how many spaces each line is
			for(z = 1; z <= num - x; z++)
				System.out.print(" ");

			for(y = 0; y <= x; y++)
			{
				if(y == 0 || x == 0)
					a = 1;
				else
					a = a * (x - y + 1)/y;
				System.out.print(" " + a);
			}
			System.out.println();
		}
	}
}