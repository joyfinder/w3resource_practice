/* Write a Java program to reverse a string using recursion 
	The given string is: The quick brown fox jumps
	The string in reverse order is:
	spmuj xof nworb kciuq ehT*/
import java.util.*;


class w3res_string4 {
	void reverseString(String str)
	{
		if((str == null) || (str.length() <= 1))
			System.out.println(str);
		else
		{
			System.out.print(str.charAt(str.length() - 1));
			reverseString(str.substring(0, str.length() - 1));
		}
	}

	public static void main(String[] args)
	{
		String str = "Type carefully!";


		System.out.println("The given string is: " + str);

		System.out.println("The string in reverse order is:");
		w3res_string4 result = new w3res_string4();
		result.reverseString(str);

	}
}