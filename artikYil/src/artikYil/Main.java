package artikYil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Yıl giriniz : ");
		int year = scan.nextInt();
		
		if(year % 4 == 0) {
			System.out.println(year + " yılı artık yıldır.");
		}else if(year % 400 == 0) {
			System.out.println(year + " yılı artık yıldır.");
		}else {
			System.out.println(year + " yılı artık yıl değildir.");
		}
		

	}

}
