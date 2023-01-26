package taksimetre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*	Taksimetre KM başına 2.20 TL tutmaktadır.
			Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
			Taksimetre açılış ücreti 10 TL'dir.	*/
		double distance = 0;
		double total=10;
		double persum = 2.20;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Mesafeyi giriniz : ");
		distance = inp.nextDouble();
		total += (distance*persum);
		if(total<=20) { total = 20;	}
		
		System.out.print("Toplam ücret : " + total);
		
		

	}

}
