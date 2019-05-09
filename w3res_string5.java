// Write a Java program to reverse words in a given string.

import java.util.*;

public class w3res_string5 {
	public static String Reverse_wordString(String str){
		StringBuilder str2 = new StringBuilder(str);
		String rev_str = str2.reverse().toString();

		String[] words = rev_str.split(" ");
		StringBuilder rev = new StringBuilder();
		for(String str3: words)
		{
			str2 = new StringBuilder(str3);
			rev.append(str2.reverse() + " ");
		}
		rev.deleteCharAt(rev.length() - 1);
		return rev.toString();
	}

	public static void main(String[] args)
	{
		String str = "I am having dinner.";

		System.out.println("The given string is: " + str);
		System.out.println("Reverse string: " + Reverse_wordString(str));
		
	}
}