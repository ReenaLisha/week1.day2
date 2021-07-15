package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count = 0;
		char[] a = str.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if ((a[i]) == 'c') {
				count += 1;
				System.out.println(i);
		}
	}

}
}
