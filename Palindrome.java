package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "mam";
		String rev = "";
		char[] i = name.toCharArray();
		for (int j =name.length()-1; j>=0;j--) {
			rev = rev+i[j];
			
			
		}
		System.out.println(rev);
		if (name.equalsIgnoreCase(rev))
		System.out.println("palindrome");
}
}