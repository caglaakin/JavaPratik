package palindromik;

import java.util.Scanner;

public class Main {
	
	public static boolean isPalindrome(String str) {
		String reverse ="";
		for(int i = 0; i<str.length(); i++) {
			reverse += str.charAt((str.length()-1)-i);
		}
		
		if(str.equals(reverse)) {
			return true;
			
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kelime giriniz : ");
		String str = scan.next();
		
		if(isPalindrome(str)) {
			System.out.println("'" +str + "' palindromik bir kelimedir.");
		}else {
			System.out.println("'" + str +"' palindromik bir kelime değildir.");
		}
		

	}

}
