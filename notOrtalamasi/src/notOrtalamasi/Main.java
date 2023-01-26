package notOrtalamasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mat, fizik, kimya, turkce, tarih, muzik;
		
		System.out.print("Matematik notunuzu giriniz : ");
		mat = input.nextInt();
		System.out.print("Fizik notunuzu giriniz : ");
		fizik = input.nextInt();
		System.out.print("Kimya notunuzu giriniz : ");
		kimya = input.nextInt();
		System.out.print("Türkçe notunuzu giriniz : ");
		turkce = input.nextInt();
		System.out.print("Tarih notunuzu giriniz : ");
		tarih = input.nextInt();
		System.out.print("Müzik notunuzu giriniz : ");
		muzik = input.nextInt();
		
		double sonuc = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
		System.out.println("Ortalamanız : " + sonuc);
		
		String gectikaldi =(sonuc>= 60) ? "Sınıfı Geçtiniz":"Sınıfta Kaldınız";
		System.out.println(gectikaldi);
		
	}

}
