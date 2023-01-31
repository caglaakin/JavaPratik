package sinifGecme;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int mat,fizik,turkce,kimya,muzik,dsayi=0;
		double total=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Matematik notunuzu giriniz : ");
		mat =scan.nextInt();
		System.out.print("Fizik notunuz : ");
		fizik =scan.nextInt();
		System.out.print("Türkçe notunuz : ");
		turkce =scan.nextInt();
		System.out.print("Kimya notunuz : ");
		kimya =scan.nextInt();
		System.out.print("Müzik notunuz : ");
		muzik =scan.nextInt();
		
		if((mat >= 0) && (mat <= 100)) {
			total += mat;
			dsayi++;
		}
		if((fizik >= 0) && (fizik <= 100)) {
			total += fizik;
			dsayi++;
		}
		if((turkce >= 0) && (turkce <= 100)) {
			total += turkce;
			dsayi++;
		}
		if((kimya >= 0) && (kimya <= 100)) {
			total += kimya;
			dsayi++;
		}
		if((muzik >= 0) && (muzik <= 100)) {
			total += muzik;
			dsayi++;
		}
		
		double average =total/dsayi;
		
		if(average >= 55) {
			System.out.print("Tebrikler! Geçtiniz. Ortalamanız : " + average );
		}else {
			System.out.print("Kaldınız. Ortalamanız : "+ average);
		}
		
		

	}

}
