/* Write a Java program to append two given strings such that, if the concatenation creates a double characters then omit one of the characters. */

import java.util.*;

class w3res_string6 {
	String append(String str, String str2){
		if(str.length() != 0 && str2.length() != 0 && str.charAt(str.length() - 1) == str2.charAt(0))
			return str + str2.substring(1);
		return str + str2;

	}
	public static void main(String[] args)
	{
		w3res_string6 ob = new w3res_string6();
		String str = "Hello";
		String str2 = "Kitty";

		System.out.println("The given strings are: " + str + " and " + str2);
		System.out.println("The string after concatinatino are: " + ob.append(str,str2));
	}
}