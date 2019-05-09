/*Write a Java program to find the duplicate values of an array of string values. */

class w3res_array7 {
	public static void main(String[] args)
	{
		String[] str = {"hello","good","bad","good","bad"};

		for(int x = 0; x < str.length - 1; x++)
		{
			for(int y = 0; y < str.length; y++)
			{
				if((str[x].equals(str[y]) && (x != y)))
				{
					System.out.println("Repeated valus are: " + str[y]);
				}
			}
		}
	}
}