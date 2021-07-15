package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char a[] = test.toCharArray();
		for (int i = 0; i < a.length; i++) {
		if (Character.isLetter(a[i])) {
				letter += 1;
			}
		else if (Character.isDigit(a[i])) {
			num += 1;
		}
		else if (Character.isSpaceChar(a[i])) {
		 space+=1;
		}
			
		else {
			specialChar += 1;
		
		} 
		}
		System.out.println("Count of letter is : " + letter);
		System.out.println("Count of number is : " + num);
		System.out.println("Count of space is : " + space);
		System.out.println("Count of specialcharacter is : " + specialChar);
	}

}
