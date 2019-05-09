/* Write a program in Java to display the pattern like right angle triangle with a number. */
/* Test Data
Input number of rows : 10 
Expected Output :

1                                                                                
12                                                                               
123                                                                              
1234                                                                             
12345                                                                            
123456                                                                           
1234567                                                                          
12345678                                                                         
123456789                                                                        
12345678910 */

import java.util.Scanner;

class w3res_condi_statement5 {
	public static void main(String[] args)
	{
		int num;
		int val, val2;

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of rows: ");
		num = input.nextInt();
		System.out.println();

		// the 1st loop iteration determines the number of lines
		for(val = 1; val <= num; val++)
		{
			for(val2 = 1; val2 <= val; val2++)
			{
				System.out.print(val2);
			}
			System.out.println();
		}
	}
}                                                               
