/* Write a Java program to print an American flag on the screen. */
/* Question from w3resource Q14
/* Instead of keeping using print to show the result,
   personally choosing iteration to do the work.	*/


class us_flag {
	public static void main(String[] args)
	{
		System.out.println();

		for(int i = 0; i < 5; i++)
		{
			System.out.println("* * * * * * ==================================");
			System.out.println(" * * * * *  ==================================");
		}

		System.out.println("* * * * * * ==================================");

		for(int x = 0; x < 7; x++)
		{
			for(int i = 0; i < 46; i++)
			{
				System.out.print("=");
			}
			System.out.println();
		}
	}
}