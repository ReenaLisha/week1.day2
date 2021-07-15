package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
			String text2 = "potss"; 
			if (text1.length() == text2.length())
			{
			char[] a = text1.toCharArray();
			char[] b = text2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			if (Arrays.equals(a, b)) {
				System.out.println( text1+ " is an anagram of "+text2);
			}
			}
			else {
				System.out.println( text1+ " is not an anagram of "+text2);
			}
	}

}
