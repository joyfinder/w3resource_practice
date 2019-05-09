/* Write a java program to generate a following @'s triangle. Go to the editor

Test Data
Input the number: 6 
Expected Output :

      @                                                  
     @@                                                  
    @@@                                                  
   @@@@                                                  
  @@@@@                                                  
 @@@@@@ */





import java.util.Scanner;

class w3res_condi_statement7 {
	public static void main(String[] args)
	{
		int num;
		int x,y,z;

		Scanner val = new Scanner(System.in);
		System.out.println("Please enter the number of rows: ");
		num = val.nextInt();

		// 1st iteration determines the number of rows
		for(x = 0; x < num; x++)
		{	
			// 2nd iteration z determines the number of spaces in each line
			for(z = num - x; z > 0; z--)
			{
				System.out.print(" ");
			}
			for(y = 0; y <= x; y++)
			{
				System.out.print("@");
			}
			System.out.println();
		}
	}
}
		