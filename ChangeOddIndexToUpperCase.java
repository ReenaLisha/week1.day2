package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		String upperCase = "";
		
		char[] a= test.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (i%2 == 0)
			{
				char c = Character.toUpperCase(a[i]);
				upperCase += Character.toString(c);
			}
			else
			{
				upperCase += Character.toString(a[i]);
			}
			
		
		
		System.out.println(upperCase);
}
}
}
