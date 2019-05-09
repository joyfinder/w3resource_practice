/* Write a Java program to get the character at the given index within the String.*/

class w3res_string {
	public static void main(String[] args)
	{
		String str = "Doing exercises!";
		System.out.println("Initial String = " + str);

		int idx = str.charAt(4);
		int idx2 = str.charAt(7);

		System.out.println("The character at position 4 is " + (char)idx);
		System.out.println("The character at position 7 is " + (char)idx2);
	}
}