// Write a Java program to compare a given string to the specified character sequence

class w3res_string3 {
	public static void main(String[] args)
	{
		String str = "Type carefully!";
		String str2 = "type carefully!";
		CharSequence str3 = "Type carefully!";

		System.out.println("Comparing " + str + " and " + str3 + " : " + str.contentEquals(str3));
		System.out.println("Comparing " + str2 + " and " + str3 + " : " + str2.contentEquals(str3));
	}
}