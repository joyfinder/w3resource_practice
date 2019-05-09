// Write a Java program to get the character (Unicode code point) at the given index within the String.

class w3res_string2 {
	public static void main(String[] args)
	{
		String str = "Java practice!";
		System.out.println("Initial string: " + str);

		// codepoint at 5 & 9
		int code_point = str.codePointAt(5);
		int code_point2 = str.codePointAt(9);

		System.out.println("character of code point is : " + code_point);
		System.out.println("Another character of code point is : " + code_point2);
	}
}